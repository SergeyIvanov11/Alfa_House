package org.alfa.alfa_house.model;

import lombok.Value;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Value
public class User {

    UUID id;

    String name;

    String surname;

    String password;

    String email;

    String phoneNumber;

    LocalDateTime birthdate; // дата рождения

    LocalDateTime registrationDate; // дата регистрации

    File avatar; // аватарка

    List<Post> favoritePosts; // папка избранное

    List<Post> madePosts; // объявления от пользователя

    //  List<Message> messages; // папка сообщения

    // List<Notification> notifications; // папка уведомления
}
