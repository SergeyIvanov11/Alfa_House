package org.alfa.alfa_house.service;

import lombok.RequiredArgsConstructor;
import org.alfa.alfa_house.exception.FlatNotFoundException;
import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.model.FlatEntity;
import org.alfa.alfa_house.repository.FlatRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DefaultFlatService implements FlatService {
    private final FlatRepository flatRepository;
    private final FlatToEntityMapper mapper;

    @Override
    public Flat getFlatById(UUID id) {
        FlatEntity flatEntity = flatRepository
                .findById(id)
                .orElseThrow(() -> new FlatNotFoundException("Квартира не найдена: id = " + id));

        return mapper.flatEntityToFlat(flatEntity);
    }

    @Override
    public List<Flat> getAllFlats() {
        Iterable<FlatEntity> iterable = flatRepository.findAll();

        List<Flat> flats = new ArrayList<>();
        for (FlatEntity flatEntity : iterable) {
            flats.add(mapper.flatEntityToFlat(flatEntity));
        }
        return flats;
    }

    @Override
    public void addFlat(Flat flat) {
        FlatEntity flatEntity = mapper.flatToFlatEntity(flat);
        flatRepository.save(flatEntity);
    }

    public List<FlatEntity> findAllByRoomCountContaining(int roomCount){
        return flatRepository.findAllByRoomCountContaining(roomCount);
    }

    public List<FlatEntity> findByPriceLessThanOrderByPriceAsc(long price){
        return flatRepository.findByPriceLessThanOrderByPriceAsc(price);
    }


}
