package org.alfa.alfa_house.model;

import org.alfa.alfa_house.model.types.HouseType;
import org.alfa.alfa_house.model.types.Lift;

public class House {

    int yearOfBuilding;

    int floorCount;

    String street;

    int houseNumber;

    String city;

    Lift lift;

    double ceilingHeight;

    HouseType houseType; // тип дома

    int minsForMetro; // минуты до метро пешком

    String nearestMetro; // ближайшее метро
}
