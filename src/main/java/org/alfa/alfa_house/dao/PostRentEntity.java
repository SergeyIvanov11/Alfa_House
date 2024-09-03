package org.alfa.alfa_house.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RentPosts")
public class PostRentEntity extends PostEntity {

    @Column(nullable = false)
    long deposit; // залог

    @Column(nullable = false)
    long commission; // комиссия

    @Column(nullable = false)
    int prepay; // предоплата в месяцах

    @Column(nullable = true)
    boolean isMetersIncluded; // счетчики включены или нет

    @Column(nullable = true)
    boolean animalsAllowed; //можно с животными

    @Column(nullable = true)
    boolean kidsAllowed; //можно с детьми
}
