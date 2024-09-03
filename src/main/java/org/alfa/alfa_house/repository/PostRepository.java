package org.alfa.alfa_house.repository;

import org.alfa.alfa_house.dao.FlatEntity;
import org.alfa.alfa_house.dao.PostEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, UUID>, JpaSpecificationExecutor<PostEntity> {

//    @Query("SELECT f FROM Flats f where f.id = :id")
//    Optional<FlatEntity> findById(@Param("id") UUID id);

    //поиск квартиры по количеству комнат
//    @Query("SELECT f FROM Flats f WHERE f.roomCount = :roomCount")
//    List<FlatEntity> findAllByRoomCountContaining(@Param("roomCount") int roomCount);

    //поиск квартиры меньше введенной цены
//    @Query("SELECT f FROM Flats f WHERE f.price > :minPrice and f.price <= :maxPrice ORDER BY f.price asc")
//    List<FlatEntity> findByPriceLessThanOrderByPriceAsc(@Param("minPrice") long minPrice, @Param("maxPrice") long maxPrice);
}
