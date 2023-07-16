package com.pozatticaique.dslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pozatticaique.dslist.DTO.GameMinDTO;
import com.pozatticaique.dslist.Repositories.GameRepository;
import com.pozatticaique.dslist.entities.Game;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
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

}
