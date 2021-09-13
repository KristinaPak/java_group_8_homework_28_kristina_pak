package com.company;


public class City {
    static String name;
    static int distance;

    public City(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public static void makeCity() {
        City[] cities = new City[5];
        cities[0] = new City("Амней", 50);
        cities[1] = new City("Гровсрей", 45);
        cities[2] = new City("Полдей", 75);
        cities[3] = new City("Санле", 55);
        cities[4] = new City("Манслав", 65);
        int r = (int) (Math.random() * 4);
        if (r == 0) {
            System.out.println("         Пункт назначения: город " + cities[0].name + ", расстояние: " + cities[0].distance + " лиг");
        } else if (r == 1) {
            System.out.println("     Пункт назначения: город " + cities[1].name + ", расстояние: " + cities[1].distance + " лиг");
        } else if (r == 2) {
            System.out.println("       Пункт назначения: город " + cities[2].name + ", расстояние: " + cities[2].distance + " лиг");
        } else if (r == 3) {
            System.out.println("         Пункт назначения: город " + cities[3].name + ", расстояние: " + cities[3].distance + " лиг");
        } else {
            System.out.println("      Пункт назначения: город " + cities[4].name + ", расстояние: " + cities[4].distance + " лиг");
        }
    }
}
