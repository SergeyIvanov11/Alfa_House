package org.alfa.alfa_house.service;

import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.model.FlatEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlatToEntityMapper {
    FlatEntity flatToFlatEntity(Flat Flat);
    Flat flatEntityToFlat(FlatEntity flatEntity);
}
