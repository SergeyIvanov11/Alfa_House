package org.alfa.alfa_house.request;

import lombok.Data;
import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.model.House;
import org.alfa.alfa_house.model.Post;

@Data
public class PostRequest {
    boolean isRent;

    Post post;

    Flat flat;

    House house;
}
