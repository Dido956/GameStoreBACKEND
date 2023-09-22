package org.softuni.fullstackapp.firstfullstackapp.service;

import lombok.AllArgsConstructor;
import org.softuni.fullstackapp.firstfullstackapp.models.entity.Game;
import org.softuni.fullstackapp.firstfullstackapp.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;


    @Override
    public List<Game> getAllGames() {
        return gameRepository
                .findAll();
    }

    @Override
    public Game getGameById(Long id) {
        return gameRepository
                .findById(id)
                .orElse(null);
    }

    @Override
    public Game updateGame(Long id, Game updatedGame) {
        Game existingGame = gameRepository.findById(id).orElse(null);
        if (existingGame != null) {
            existingGame.setName(updatedGame.getName());
            existingGame.setPrice(updatedGame.getPrice());

            return gameRepository.save(existingGame);
        }
        return null;
    }

    @Override
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}
