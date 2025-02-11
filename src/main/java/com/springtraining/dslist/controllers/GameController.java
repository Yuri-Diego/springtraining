package com.springtraining.dslist.controllers;

import com.springtraining.dslist.dto.GameDTO;
import com.springtraining.dslist.dto.GameMinDTO;
import com.springtraining.dslist.entities.Game;
import com.springtraining.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> finAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO finbyId(@PathVariable Long id) {
        return gameService.findById(id);
    }

}
