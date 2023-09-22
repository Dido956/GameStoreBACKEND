package org.softuni.fullstackapp.firstfullstackapp.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.softuni.fullstackapp.firstfullstackapp.models.entity.Game;
import org.softuni.fullstackapp.firstfullstackapp.repository.GameRepository;
import org.softuni.fullstackapp.firstfullstackapp.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class GameController {

    private GameRepository gameRepository;

    @PostMapping("/add-game")
    Game newGame(@RequestBody Game newGame) {
        return gameRepository.save(newGame);
    }

    @GetMapping("/all-games")
    List<Game> allGames(){
        return gameRepository.findAll();
    }
}
