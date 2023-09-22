package org.softuni.fullstackapp.firstfullstackapp.repository;

import org.softuni.fullstackapp.firstfullstackapp.models.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
