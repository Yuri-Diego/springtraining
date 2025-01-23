package com.springtraining.dslist.repositories;

import com.springtraining.dslist.entities.GameList;
import com.springtraining.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
