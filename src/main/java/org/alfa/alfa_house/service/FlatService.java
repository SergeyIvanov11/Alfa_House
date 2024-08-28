package org.alfa.alfa_house.service;

import org.alfa.alfa_house.model.Flat;

import java.util.List;
import java.util.UUID;

public interface FlatService {
    Flat getFlatById(UUID id);
    List<Flat> getAllFlats();
    void addFlat(Flat flat);
}
