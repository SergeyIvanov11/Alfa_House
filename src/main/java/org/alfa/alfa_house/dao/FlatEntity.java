package org.alfa.alfa_house.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.alfa.alfa_house.model.House;
import org.alfa.alfa_house.model.types.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Flats")
public class FlatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    boolean isApartment; // апартаменты или нет

    @Column(nullable = true)
    boolean isNew; // новостройка или нет

    @Column(nullable = true)
    boolean hasFurniture; // c мебелью или нет, и т.д.

    @Column(nullable = true)
    boolean hasTV;

    @Column(nullable = true)
    boolean hasInternet;

    @Column(nullable = true)
    boolean hasAirConditioner;

    @Column(nullable = true)
    boolean hasWashingMachine;

    @Column(nullable = true)
    boolean hasFridge;

    @Column(nullable = true)
    boolean hasDishWasher;

    @Column(nullable = true)
    SanUzel sanUzel; // вид санузла

    @Column(nullable = true)
    Bathroom bathroom; // ванна или душ

    @Column(nullable = true)
    Stove stove; // какая плита

    @Column(nullable = true)
    Layout layout; // планировка

    @Column(nullable = true)
    WindowView view; // вид из окна

    @Column(nullable = true)
    Balcony typeOfBalcony;  // тип балкона

    @Column(nullable = true)
    Remont typeOfRemont; // тип ремонта

    @Column(nullable = true)
    RoomCount roomCount;

    @Column(nullable = true)
    int floor;

    @Column(nullable = true)
    double area;

    @Column(nullable = true)
    String description;

    @ManyToOne(fetch = FetchType.LAZY)
    HouseEntity house;
}
