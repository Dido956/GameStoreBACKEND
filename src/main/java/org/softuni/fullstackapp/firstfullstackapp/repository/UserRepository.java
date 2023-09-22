package org.softuni.fullstackapp.firstfullstackapp.repository;

import org.softuni.fullstackapp.firstfullstackapp.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
