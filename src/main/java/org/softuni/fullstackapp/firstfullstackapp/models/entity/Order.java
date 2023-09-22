package org.softuni.fullstackapp.firstfullstackapp.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order extends BaseEntity{

    @Column(name = "order_time")
    private LocalDateTime orderTime;
    @ManyToOne
    private Game game;
    @ManyToOne
    private User user;
}
