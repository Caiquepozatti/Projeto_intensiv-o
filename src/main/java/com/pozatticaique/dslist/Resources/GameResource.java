package com.pozatticaique.dslist.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pozatticaique.dslist.DTO.GameMinDTO;
import com.pozatticaique.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();		
		return result;
	}

}
