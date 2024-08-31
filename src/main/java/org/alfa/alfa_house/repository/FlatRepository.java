package org.alfa.alfa_house.repository;

import org.alfa.alfa_house.dao.FlatEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface FlatRepository extends CrudRepository<FlatEntity, UUID> {

    Optional<FlatEntity> findById(UUID id);

    //поиск квартиры по количеству комнат
    @Query("SELECT f FROM Flats f WHERE f.roomCount = :roomCount")
    List<FlatEntity> findAllByRoomCountContaining(@Param("roomCount") int roomCount);

    //поиск квартиры меньше введенной цены
    @Query("SELECT f FROM Flats f WHERE f.price <= :price ORDER BY f.price asc")
    List<FlatEntity> findByPriceLessThanOrderByPriceAsc(@Param("price") long price);
}
