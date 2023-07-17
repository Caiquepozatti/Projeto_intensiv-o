package com.pozatticaique.dslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pozatticaique.dslist.DTO.GameListDTO;
import com.pozatticaique.dslist.Repositories.GameListRepository;
import com.pozatticaique.dslist.entities.GameList;
import com.pozatticaique.dslist.projections.GameProjection;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional
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
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {

		List<GameProjection> list = gameRepository.searchByList(listId);

		GameProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);

		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}

}
