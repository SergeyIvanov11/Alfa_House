package org.alfa.alfa_house.model;

import lombok.EqualsAndHashCode;
import lombok.Value;
@EqualsAndHashCode(callSuper = true)
@Value
public class PostRent extends Post{
    long deposit; // залог

    long commission; // комиссия

    int prepay; // предоплата в месяцах

    boolean isMetersIncluded; // счетчики включены или нет

    boolean animalsAllowed; //можно с животными

    boolean kidsAllowed; //можно с детьми
}
