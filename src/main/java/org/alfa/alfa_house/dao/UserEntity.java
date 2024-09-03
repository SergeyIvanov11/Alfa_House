package org.alfa.alfa_house.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String surname;

    @Column(unique = true, nullable = false)
    String password;

    @Column(unique = true, nullable = false)
    String email;

    @Column(unique = true, nullable = false)
    String phoneNumber;

    @Column(nullable = false)
    LocalDateTime birthdate; // дата рождения

    @Column(nullable = false)
    LocalDateTime registrationDate; // дата регистрации

    @Column(nullable = false)
    File avatar; // аватарка

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<PostEntity> favoritePosts; // папка избранное

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<PostEntity> madePosts; // объявления от пользователя
}
