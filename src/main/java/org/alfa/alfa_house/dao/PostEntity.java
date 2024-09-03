package org.alfa.alfa_house.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.model.User;
import org.alfa.alfa_house.model.types.PostStatus;
import org.alfa.alfa_house.model.types.Seller;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    long price;

    @OneToOne
    FlatEntity flat;

    @ManyToOne(fetch = FetchType.LAZY)
    UserEntity user; // автор объявления

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Seller seller; // тип сделки - агент или собственник

    @Column(nullable = false)
    LocalDateTime date; // время и дата создания объявления

    @ElementCollection(targetClass = File.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "Pictures", joinColumns = @JoinColumn(name = "postId"))
    @Column(nullable = false)
    List<File> pictures; //структура для картинок

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    PostStatus status; //в архиве, активное и т.д.
}
