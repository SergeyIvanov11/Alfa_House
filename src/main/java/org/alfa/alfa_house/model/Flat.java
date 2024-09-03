package org.alfa.alfa_house.model;

import lombok.Value;
import org.alfa.alfa_house.model.types.*;

import java.util.UUID;

@Value
public class Flat {
    UUID id;

    boolean isApartment; // апартаменты или нет

    boolean isNew; // новостройка или нет

    boolean hasFurniture; // c мебелью или нет, и т.д.

    boolean hasTV;

    boolean hasInternet;

    boolean hasAirConditioner;

    boolean hasWashingMachine;

    boolean hasFridge;

    boolean hasDishWasher;

    SanUzel sanUzel; // вид санузла

    Bathroom bathroom; // ванна или душ

    Stove stove; // какая плита

    Layout layout; // планировка

    WindowView view; // вид из окна

    Balcony typeOfBalcony;  // тип балкона

    Remont typeOfRemont; // тип ремонта

    RoomCount roomCount;

    int floor;

    double area;

    House house;
}
