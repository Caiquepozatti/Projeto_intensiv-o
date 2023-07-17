package com.pozatticaique.dslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pozatticaique.dslist.DTO.GameDTO;
import com.pozatticaique.dslist.DTO.GameMinDTO;
import com.pozatticaique.dslist.Repositories.GameRepository;
import com.pozatticaique.dslist.entities.Game;
import com.pozatticaique.dslist.projections.GameProjection;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;		
	
	@Transactional (readOnly = true) //Import spring, não jakart
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		List<GameMinDTO> dto = new ArrayList<>();
		for(Game x : result) {
			GameMinDTO obj = new GameMinDTO(x);
			dto.add(obj);
		}		
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
	
	@Transactional (readOnly = true)
	public GameDTO findByID(Long id) {
		Game game = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(game);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByGameList(Long listId) {
		List<GameProjection> games = gameRepository.searchByList(listId);
		return games.stream().map(GameMinDTO::new).toList();
	}
	
	

}
