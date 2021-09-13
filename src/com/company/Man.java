package com.company;

public class Man {
    static int maxWeight = 55;
    static int speed = (int) (Math.random() * 4 - 1);
    static int startMoney = 400;
    static int money;
    static int weight;

    public static void printGoods() {
        System.out.println("Здравствуй торговец, твоя телега вмещает 55 единиц товара, скорось каждый день" +
                " меняется от 1 до 5 лиг в день, а в кармане 400 монет");
        buyGoods();


    }

    public static void buyGoods() {
        while (true) {
            GOODS.printGoods();
            if (GOODS.MEET.weight + GOODS.FLOUR.weight + GOODS.GRAIN.weight + GOODS.PAINT.weight +
                    GOODS.FABRICS.weight + GOODS.DRIED_FRUITS.weight <= maxWeight || GOODS.MEET.price +
                    GOODS.FABRICS.price + GOODS.FLOUR.price + GOODS.GRAIN.price + GOODS.PAINT.price +
                    GOODS.DRIED_FRUITS.price <= startMoney) {
                money = 400 - (GOODS.MEET.price*GOODS.MEET.weight) -
                        (GOODS.FABRICS.price*GOODS.FABRICS.weight)
                        - (GOODS.FLOUR.price*GOODS.FLOUR.weight) -
                        (GOODS.GRAIN.price*GOODS.GRAIN.weight)
                        - (GOODS.PAINT.price*GOODS.PAINT.weight) -
                        (GOODS.DRIED_FRUITS.price*GOODS.DRIED_FRUITS.weight);
                weight = 55 - GOODS.MEET.weight - GOODS.FLOUR.weight -
                        GOODS.GRAIN.weight - GOODS.PAINT.weight -
                        GOODS.FABRICS.weight - GOODS.DRIED_FRUITS.weight;
                System.out.println("            Осталось " + money + " монет, загрузил " + weight + " единиц товара");
                break;
            }
        }
    }

    public static void sellGoods() {
        printGoods();

    }
}
