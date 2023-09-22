package org.softuni.fullstackapp.firstfullstackapp.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.softuni.fullstackapp.firstfullstackapp.models.Platform;

import java.math.BigDecimal;

@Entity
@Table(name = "games")
@Getter
@Setter
@NoArgsConstructor
public class Game extends BaseEntity{

    @Column(name = "name")
    private String name;
    @Column(name = "platform")
    @Enumerated(value = EnumType.STRING)
    private Platform platform;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "genre")
    private String genre;

}
