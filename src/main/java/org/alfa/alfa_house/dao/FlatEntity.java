package org.alfa.alfa_house.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.alfa.alfa_house.model.types.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    SanUzel sanUzel; // вид санузла

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    Bathroom bathroom; // ванна или душ

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    Stove stove; // какая плита

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    Layout layout; // планировка

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    WindowView view; // вид из окна

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    Balcony typeOfBalcony;  // тип балкона

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    Remont typeOfRemont; // тип ремонта

    @Enumerated(EnumType.STRING)
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
