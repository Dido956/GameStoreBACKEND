package org.softuni.fullstackapp.firstfullstackapp.repository;

import org.softuni.fullstackapp.firstfullstackapp.models.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
