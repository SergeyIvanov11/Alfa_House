package org.alfa.alfa_house.service;

import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.request.FlatRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlatToDtoMapper {
    Flat flatRequestToFlat(FlatRequest flatRequest);
}