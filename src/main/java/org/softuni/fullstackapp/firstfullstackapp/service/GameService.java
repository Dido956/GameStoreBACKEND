package org.softuni.fullstackapp.firstfullstackapp.service;

import org.softuni.fullstackapp.firstfullstackapp.models.entity.Game;

import java.util.List;

public interface GameService {
    List<Game> getAllGames();
    Game getGameById(Long id);
    Game updateGame(Long id,Game updatedGame);
    void deleteGame(Long id);
}
