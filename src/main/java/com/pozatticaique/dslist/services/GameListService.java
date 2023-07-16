package com.pozatticaique.dslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pozatticaique.dslist.DTO.GameListDTO;
import com.pozatticaique.dslist.Repositories.GameListRepository;
import com.pozatticaique.dslist.entities.GameList;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		
		List<GameListDTO> dto = new ArrayList<>();
		for(GameList x : result) {
			GameListDTO obj = new GameListDTO(x);
			dto.add(obj);
		}		
		//List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		
		return dto;
	}

}
