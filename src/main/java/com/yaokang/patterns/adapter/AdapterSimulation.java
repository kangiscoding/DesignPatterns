package com.yaokang.patterns.adapter;

public class AdapterSimulation {

    public static void main(String[] args) {

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }

    // 此示例为对象适配器模式，采用组合方式实现接口转换；除此之外还有继承方式实现的类适配器模式。
}
