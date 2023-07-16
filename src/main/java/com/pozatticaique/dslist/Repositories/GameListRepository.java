package com.pozatticaique.dslist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pozatticaique.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
