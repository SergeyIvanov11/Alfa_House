package org.alfa.alfa_house.service;

import org.alfa.alfa_house.dao.HouseEntity;
import org.alfa.alfa_house.dao.PostEntity;
import org.alfa.alfa_house.dao.UserEntity;
import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.dao.FlatEntity;
import org.alfa.alfa_house.model.House;
import org.alfa.alfa_house.model.Post;
import org.alfa.alfa_house.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    PostEntity postToPostEntity(Post post);
    Post postEntityToPost(PostEntity postEntity);

    FlatEntity flatToFlatEntity(Flat Flat);
    Flat flatEntityToFlat(FlatEntity flatEntity);

    HouseEntity houseToHouseEntity(House house);
    House houseEntityToHouse(HouseEntity houseEntity);

    UserEntity userToUserEntity(User user);
    User userEntityToUser(UserEntity userEntity);
}
