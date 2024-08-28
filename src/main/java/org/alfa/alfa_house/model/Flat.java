package org.alfa.alfa_house.model;

import lombok.Value;

import java.util.UUID;

@Value
public class Flat {
    UUID id;

    int roomCount;

    int floor;

    Double area;

    Long price;

    String nearestMetro;
}
