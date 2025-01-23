package com.springtraining.dslist.services;

import com.springtraining.dslist.dto.GameListDTO;
import com.springtraining.dslist.dto.GameMinDTO;
import com.springtraining.dslist.entities.GameList;
import com.springtraining.dslist.projections.GameMinProjection;
import com.springtraining.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}
