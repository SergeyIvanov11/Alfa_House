package org.alfa.alfa_house.service;

import org.alfa.alfa_house.model.Post;
import org.alfa.alfa_house.request.PostRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostToDtoMapper {
    Post postRequestToPost(PostRequest postRequest);
}