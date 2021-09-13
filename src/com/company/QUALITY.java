package com.company;

public enum QUALITY {
    NORMAL((1.2), "состояние - нормальное"),
    A_LITTLE_SPOIL((0.95), "состояние - слегка испорчен"),
    HALF_SPOIL((0.55), "состояние - половина испортилась"),
    ALMOST_SPOIL((0.25), "состояние - почти весь пропал"),
    NOT_FOR_USE((0.1), "состояние - испорчен в хлам");

    private String description;


    QUALITY(double kof, String description) {
        this.description = description;
    }

    public String getDirection() {
        return description;
    }
}
