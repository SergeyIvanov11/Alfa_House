package org.alfa.alfa_house.model;

import org.alfa.alfa_house.model.types.Seller;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Post {
    UUID id;
    long price;
    Flat flat;
    User user; // автор объявления
    Seller seller; // тип сделки - агент или собственник
    LocalDateTime date; // время и дата создания объявления
    List<File> pictures; //структура для картинок
}
