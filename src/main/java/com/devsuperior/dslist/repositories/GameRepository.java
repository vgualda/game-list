package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.Game;

//Game <T = type of entity, type of the entity's id> 
public interface GameRepository extends JpaRepository<Game, Long> {

}
