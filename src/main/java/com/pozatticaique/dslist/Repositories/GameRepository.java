package com.pozatticaique.dslist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pozatticaique.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
