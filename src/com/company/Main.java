package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Man.printGoods();
        City.makeCity();
        selectNextAction(printEvent());

    }

    public static Integer numb = 1;

    public static ACTION printEvent() {
        int action = (int) (Math.random() * 8 + 1);
        if (action == 1) {
            selectNextAction(ACTION.USUAL_DAY);
        } else if (action == 2) {
            selectNextAction(ACTION.RAIN);
        } else if (action == 3) {
            selectNextAction(ACTION.GOOD_ROAD);
        } else if (action == 4) {
            selectNextAction(ACTION.WHEEL_IS_BROKEN);
        } else if (action == 5) {
            selectNextAction(ACTION.RIVER);
        } else if (action == 6) {
            selectNextAction(ACTION.MEET_LOCAL);
        } else if (action == 7) {
            selectNextAction(ACTION.BANDITS_ON_THE_ROAD);
        } else if (action == 8) {
            selectNextAction(ACTION.SHOP);
        } else {
            selectNextAction(ACTION.GOOD_IS_GONE);
        }
        return printEvent();
    }

    private static void printAction(ACTION action) {
        System.out.println(String.format("%d| %s", numb, action.getDescription()));
        numb = numb + 1;
    }

    public static void selectNextAction(ACTION action) {
        ACTION newAction = action;
        int newSpeed;
        int distance = City.distance;
        for (int dis = City.distance; dis <= 0; dis--) {
            switch (action) {
                case USUAL_DAY:
                    System.out.println(ACTION.USUAL_DAY.getDescription());
                    distance = distance - Man.speed;
                    System.out.println("Обычный день, ничего не произошло, скорость передвижения " + Man.speed);
                    System.out.println("Осталось пройти " + distance);
                    break;
                case RAIN:
                    System.out.println(ACTION.RAIN.getDescription());
                    distance = Man.speed - 2;
                    int spoil = ((int) Math.random() * 2);
                    if (spoil == 0) {
                        GOODS.randomSpoil();
                        break;
                    } else {
                        System.out.println("Успел укрыть полотном продукты, качество товара не пострадало");

                    }
                    newSpeed = distance - Man.speed;
                    System.out.println("Пошел дождь, скорост передвижения " + newSpeed);
                    System.out.println("Осталось пройти " + distance);
                    break;
                case GOOD_ROAD:
                    System.out.println(ACTION.GOOD_ROAD.getDescription());
                    distance = distance - Man.speed;
                    if (Man.speed > 4) {
                        newSpeed = 5;
                        System.out.println("Повезло! дорога на удивление ровная, скорость передвижения " + newSpeed);
                        System.out.println("Осталось пройти " + distance);
                        printEvent();

                    } else if (Man.speed <= 3) {
                        newSpeed = Man.speed + 2;
                        System.out.println("Повезло! дорога на удивление ровная, скорость передвижения " + newSpeed);
                        System.out.println("Осталось пройти " + distance);
                        printEvent();

                    }
                    break;
                case RIVER:

                    System.out.println(ACTION.RIVER.getDescription());
                    System.out.println("Обычный день, ничего не произошло, скорость передвижения 0");
                    System.out.println("Осталось пройти " + City.distance);
                    printEvent();
                    break;
                case MEET_LOCAL:
                    System.out.println(ACTION.MEET_LOCAL.getDescription());
                    System.out.println("Встретил местного , удалось сократить путь, скорость передвижения " + Man.speed);
                    int r = (int) (Math.random() * 4 + 3);
                    int newD = distance - r - Man.speed;
                    System.out.println("Осталось пройти " + newD);
                    printEvent();
                    break;

                case BANDITS_ON_THE_ROAD:
                    System.out.println(ACTION.BANDITS_ON_THE_ROAD.getDescription());
                    int last = 400 - (GOODS.MEET.price * GOODS.MEET.weight) -
                            (GOODS.FABRICS.price * GOODS.FABRICS.weight)
                            - (GOODS.FLOUR.price * GOODS.FLOUR.weight) -
                            (GOODS.GRAIN.price * GOODS.GRAIN.weight)
                            - (GOODS.PAINT.price * GOODS.PAINT.weight) -
                            (GOODS.DRIED_FRUITS.price * GOODS.DRIED_FRUITS.weight);
                    if (last > 0) {
                        System.out.println("Встретил разбойников большой дороги , решил откупиться , у вас осталось монет 0");
                        distance = distance - Man.speed;
                        System.out.println("Осталось пройти " + distance);

                    } else {
                        int rnd = (int) (Math.random() * 5);
                        if (rnd == 0) {
                            System.out.println("Разбойники решили забрать " + GOODS.FABRICS);
                            distance = distance - Man.speed;
                            System.out.println("Осталось пройти " + distance);

                        } else if (rnd == 1) {
                            System.out.println("Разбойники решили забрать " + GOODS.PAINT);
                            distance = distance - Man.speed;
                            System.out.println("Осталось пройти " + distance);

                        } else if (rnd == 2) {
                            System.out.println("Разбойники решили забрать " + GOODS.FLOUR);
                            distance = distance - Man.speed;
                            System.out.println("Осталось пройти " + distance);

                        } else if (rnd == 3) {
                            System.out.println("Разбойники решили забрать " + GOODS.GRAIN);
                            distance = distance - Man.speed;
                            System.out.println("Осталось пройти " + distance);

                        } else if (rnd == 4) {
                            System.out.println("Разбойники решили забрать " + GOODS.MEET);
                            distance = distance - Man.speed;
                            System.out.println("Осталось пройти " + distance);


                        } else {
                            System.out.println("Разбойники решили забрать " + GOODS.DRIED_FRUITS);
                            distance = distance - Man.speed;
                            System.out.println("Осталось пройти " + distance);


                        }
                    }
                    printEvent();
                    break;

                case SHOP:
                    System.out.println(ACTION.SHOP.getDescription());
                    System.out.println("По пути виднеется в трактир. Остановиться или нет? (1- да, любая цифра- нет)");
                    Scanner scanner = new Scanner(System.in);
                    int stay = scanner.nextInt();
                    if (stay == 1) {
                        System.out.println("Вы можете купить товар)");
                        if (Man.money >= 20) {
                            System.out.println("1)" + GOODS.FLOUR.name() + " цена-" + GOODS.FLOUR.price);
                            System.out.println("2)" + GOODS.MEET.name() + " цена-" + GOODS.MEET.price);
                            System.out.println("3)" + GOODS.GRAIN.name() + " цена-" + GOODS.GRAIN.price);
                            System.out.println("4)" + GOODS.PAINT.name() + " цена-" + GOODS.PAINT.price);
                            System.out.println("5)" + GOODS.FABRICS.name() + " цена-" + GOODS.FABRICS.price);
                            System.out.println("6)" + GOODS.DRIED_FRUITS.name() + " цена-" + GOODS.DRIED_FRUITS.price);
                            System.out.println("Введите номер");
                            int numb = scanner.nextInt();
                            if (numb == 1) {
                                System.out.println("Вы купили муку");

                            } else if (numb == 2) {
                                System.out.println("Вы купили мясо");

                            } else if (numb == 3) {
                                System.out.println("Вы купили зерно");

                            } else if (numb == 4) {
                                System.out.println("Вы купили краски");

                            } else if (numb == 5) {
                                System.out.println("Вы купили ткани");

                            } else if (numb == 6) {
                                System.out.println("Вы купили сухофрукты");

                            }
                        } else {
                            System.out.println("У вас недостаточно монет");

                        }
                    } else {
                        System.out.println("Вы проехали трактир, скорость передвижения " + Man.speed);
                        distance = distance - Man.speed;
                        System.out.println("Осталось пройти " + distance);

                    }
                    printEvent();
                    break;
                case GOOD_IS_GONE:
                    System.out.println(ACTION.GOOD_IS_GONE.getDescription());
                    distance = distance - Man.speed;
                    System.out.println("Случайно испортился один из товаров. Это печально. :)");
                    System.out.println("Осталось пройти " + distance);
                    printEvent();
                    break;
            }
            if (City.distance <= 0) {
                System.out.println("Вы добрались до пункта назначения!");
                printEvent();
                break;
            }
        }


        printAction(newAction);
        if (City.distance != 0) {
            selectNextAction(newAction);
        } else {
            Man.sellGoods();
        }
    }
}

