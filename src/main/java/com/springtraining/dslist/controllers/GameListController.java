package com.springtraining.dslist.controllers;

import com.springtraining.dslist.dto.GameListDTO;
import com.springtraining.dslist.dto.GameMinDTO;
import com.springtraining.dslist.services.GameListService;
import com.springtraining.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> finAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> finBylist(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
