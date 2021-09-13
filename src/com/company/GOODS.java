package com.company;


public enum GOODS {
    MEET((0), "Мясо", QUALITY.NORMAL.getDirection(), (13)),
    DRIED_FRUITS((0), "Сухофрукты", QUALITY.NORMAL.getDirection(), (10)),
    GRAIN((0), "Зерно", QUALITY.NORMAL.getDirection(), (8)),
    FLOUR((0), "Мука", QUALITY.NORMAL.getDirection(), (10)),
    FABRICS((0), "Ткани", QUALITY.NORMAL.getDirection(), (15)),
    PAINT((0), "Краска", QUALITY.NORMAL.getDirection(), (20));

    private String description;
    public int weight;
    String quality;
    int price;


    GOODS(int weight, String description, String quality, int price) {
        this.weight = (int) (weight + Math.random()*9);
        this.description = description;
        this.quality = quality;
        this.price = price;
    }

    public static void printGoods() {
        String f = "%-15s|%-7s|%-25s|%-10s";
        System.out.println(String.format(f,FLOUR.description,"вес " + FLOUR.weight , FLOUR.quality , "цена " + FLOUR.price));
        System.out.println(String.format(f,MEET.description,"вес " + MEET.weight , MEET.quality , "цена " + MEET.price));
        System.out.println(String.format(f,DRIED_FRUITS.description,"вес " + DRIED_FRUITS.weight , DRIED_FRUITS.quality , "цена " + DRIED_FRUITS.price));
        System.out.println(String.format(f,GRAIN.description,"вес " + GRAIN.weight , GRAIN.quality , "цена " + GRAIN.price));
        System.out.println(String.format(f,PAINT.description,"вес " + PAINT.weight , PAINT.quality , "цена " + PAINT.price));
        System.out.println(String.format(f,FABRICS.description,"вес " + FABRICS.weight , FABRICS.quality , "цена " + FABRICS.price));
    }

    public static void randomSpoil() {
        int r = ((int) Math.random()*5);
        if (r == 0) {
            if (MEET.quality == QUALITY.NORMAL.name()) {
                GOODS.MEET.quality = QUALITY.A_LITTLE_SPOIL.name();
                System.out.println("Качество мяса снизилось ");
            } else if (MEET.quality == QUALITY.A_LITTLE_SPOIL.name()) {
                GOODS.MEET.quality = QUALITY.HALF_SPOIL.name();
                System.out.println("Качество мяса снизилось ");
            } else if (MEET.quality == QUALITY.HALF_SPOIL.name()) {
                GOODS.MEET.quality = QUALITY.ALMOST_SPOIL.name();
                System.out.println("Качество мяса снизилось ");
            } else if (MEET.quality == QUALITY.ALMOST_SPOIL.name()) {
                GOODS.MEET.quality = QUALITY.NOT_FOR_USE.name();
                System.out.println("Качество мяса снизилось ");
            }
        } else if (r == 1) {
            if (DRIED_FRUITS.quality == QUALITY.NORMAL.name()) {
                GOODS.DRIED_FRUITS.quality = QUALITY.A_LITTLE_SPOIL.name();
                System.out.println("Качество сухофруктов снизилось ");
            } else if (DRIED_FRUITS.quality == QUALITY.A_LITTLE_SPOIL.name()) {
                GOODS.DRIED_FRUITS.quality = QUALITY.HALF_SPOIL.name();
                System.out.println("Качество сухофруктов снизилось ");
            } else if (DRIED_FRUITS.quality == QUALITY.HALF_SPOIL.name()) {
                GOODS.DRIED_FRUITS.quality = QUALITY.ALMOST_SPOIL.name();
                System.out.println("Качество сухофруктов снизилось ");
            } else if (DRIED_FRUITS.quality == QUALITY.ALMOST_SPOIL.name()) {
                GOODS.DRIED_FRUITS.quality = QUALITY.NOT_FOR_USE.name();
                System.out.println("Качество сухофруктов снизилось ");
            }
        }  else if (r == 2) {
            if (GRAIN.quality == QUALITY.NORMAL.name()) {
                GOODS.GRAIN.quality = QUALITY.A_LITTLE_SPOIL.name();
                System.out.println("Качество зерна снизилось ");
            } else if (GRAIN.quality == QUALITY.A_LITTLE_SPOIL.name()) {
                GOODS.GRAIN.quality = QUALITY.HALF_SPOIL.name();
                System.out.println("Качество зерна снизилось ");
            } else if (GRAIN.quality == QUALITY.HALF_SPOIL.name()) {
                GOODS.GRAIN.quality = QUALITY.ALMOST_SPOIL.name();
                System.out.println("Качество зерна снизилось ");
            } else if (GRAIN.quality == QUALITY.ALMOST_SPOIL.name()) {
                GOODS.GRAIN.quality = QUALITY.NOT_FOR_USE.name();
                System.out.println("Качество зерна снизилось ");
            }
        }  else if (r == 3) {
            if (FLOUR.quality == QUALITY.NORMAL.name()) {
                GOODS.FLOUR.quality = QUALITY.A_LITTLE_SPOIL.name();
                System.out.println("Качество муки снизилось ");
            } else if (FLOUR.quality == QUALITY.A_LITTLE_SPOIL.name()) {
                GOODS.FLOUR.quality = QUALITY.HALF_SPOIL.name();
                System.out.println("Качество муки снизилось ");
            } else if (FLOUR.quality == QUALITY.HALF_SPOIL.name()) {
                GOODS.FLOUR.quality = QUALITY.ALMOST_SPOIL.name();
                System.out.println("Качество муки снизилось ");
            } else if (FLOUR.quality == QUALITY.ALMOST_SPOIL.name()) {
                GOODS.FLOUR.quality = QUALITY.NOT_FOR_USE.name();
                System.out.println("Качество муки снизилось ");
            }
        }  else if (r == 4) {
            if (FABRICS.quality == QUALITY.NORMAL.name()) {
                GOODS.FABRICS.quality = QUALITY.A_LITTLE_SPOIL.name();
                System.out.println("Качество ткани снизилось ");
            } else if (FABRICS.quality == QUALITY.A_LITTLE_SPOIL.name()) {
                GOODS.FABRICS.quality = QUALITY.HALF_SPOIL.name();
                System.out.println("Качество ткани снизилось ");
            } else if (FABRICS.quality == QUALITY.HALF_SPOIL.name()) {
                GOODS.FABRICS.quality = QUALITY.ALMOST_SPOIL.name();
                System.out.println("Качество ткани снизилось ");
            } else if (FABRICS.quality == QUALITY.ALMOST_SPOIL.name()) {
                GOODS.FABRICS.quality = QUALITY.NOT_FOR_USE.name();
                System.out.println("Качество ткани снизилось ");
            }
        }  else if (r == 5) {
            if (PAINT.quality == QUALITY.NORMAL.name()) {
                GOODS.PAINT.quality = QUALITY.A_LITTLE_SPOIL.name();
                System.out.println("Качество краски снизилось ");
            } else if (PAINT.quality == QUALITY.A_LITTLE_SPOIL.name()) {
                GOODS.PAINT.quality = QUALITY.HALF_SPOIL.name();
                System.out.println("Качество краски снизилось ");
            } else if (PAINT.quality == QUALITY.HALF_SPOIL.name()) {
                GOODS.PAINT.quality = QUALITY.ALMOST_SPOIL.name();
                System.out.println("Качество краски снизилось ");
            } else if (PAINT.quality == QUALITY.ALMOST_SPOIL.name()) {
                GOODS.PAINT.quality = QUALITY.NOT_FOR_USE.name();
                System.out.println("Качество краски снизилось ");
            }
        }
    }

}
