package com.yaokang.patterns.decorator;

public class DecoratorSimulator {

    public static void main(String[] args) {
        // 浓缩咖啡，不要调料
        Beverage beverage = new EspressoCoffee();
        System.out.println(beverage.getDescription() + "cost: " + beverage.cost());

        // 浓缩咖啡，加2份摩卡，加1份奶泡
        beverage = new MochaCondiment(beverage);
        beverage = new MochaCondiment(beverage);
        beverage = new WhipCondiment(beverage);
        System.out.println(beverage.getDescription() + "cost: " + beverage.cost());

        // 综合咖啡，加1份摩卡，加1份奶泡
        Beverage beverage2 = new HouseBlendCoffee();
        beverage2 = new MochaCondiment(beverage2);
        beverage2 = new WhipCondiment(beverage2);
        System.out.println(beverage2.getDescription() + "cost: " + beverage2.cost());
    }
}
