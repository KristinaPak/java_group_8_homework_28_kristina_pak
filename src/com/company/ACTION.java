package com.company;


public enum ACTION {
    USUAL_DAY( "Обычный день"),
    RAIN( "Дождь"),
    GOOD_ROAD( "Ровная дорога"),
    WHEEL_IS_BROKEN( "Сломалось колесо"),
    RIVER( "Река"),
    MEET_LOCAL( "Встретил местного"),
    BANDITS_ON_THE_ROAD("Разбойники большой дороги"),
    SHOP("Придорожный трактир"),
    GOOD_IS_GONE("Товар испортился");
    private String description;
    ACTION( String description){this.description = description;}
    public String getDescription(){return description;}
}

