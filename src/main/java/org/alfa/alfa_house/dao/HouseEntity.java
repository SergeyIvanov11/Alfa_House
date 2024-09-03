package org.alfa.alfa_house.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.alfa.alfa_house.model.types.HouseType;
import org.alfa.alfa_house.model.types.Lift;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
@Table(name = "Houses")
public class HouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = true)
    int yearOfBuilding;

    @Column(nullable = true)
    int floorCount;

    @Column(nullable = false)
    String street;

    @Column(nullable = false)
    int houseNumber;

    @Column(nullable = false)
    String city;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    Lift lift;

    @Column(nullable = true)
    double ceilingHeight;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    HouseType houseType; // тип дома

    @Column(nullable = false)
    int minsForMetro; // минуты до метро пешком

    @Column(nullable = false)
    String nearestMetro; // ближайшее метро
}
