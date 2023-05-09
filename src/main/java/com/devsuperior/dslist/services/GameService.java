package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
		
		@Autowired
		private GameRepository gameRepository;
		
		//Here, the function makes all the data treatment automatically (framework) - DAO process
		public List<GameMinDTO> findAll() {
			List<Game> result = gameRepository.findAll();
			// Here, the function transform a Game list in a GameMinDTO list;
			//stream - data sequence operations library, that has .map - transform objects from smthng to another smthng.
			List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
			return dto;
			
			//or
			// return List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
			
	}	
	
}
