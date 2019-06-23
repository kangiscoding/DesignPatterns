package com.yaokang.patterns.strategy;

public class DuckSimulator {

    public static void main(String[] args) {
        // 绿头鸭
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        // 模型鸭子
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();// 使用构造函数中定义的fly
        modelDuck.setFlyBehavior(new FlyRocket());// 设定fly方法
        modelDuck.performFly();
    }

    // 策略模式的由来: 通常对于不同Duck的不同行为fly,quack, 可以将其放入接口中，不同子类针对自身特点实现接口覆盖行为方法，
    // 但是这样直接用接口太笨重了，容易出现重复代码，造成代码无法复用。

    // 策略模式将会变化的部分（quack, fly）封装起来。利用多态针对超类变成，执行时根据实际状况执行真正的行为。

    // 策略模式的设计原则：多用组合，少用继承。

    // 策略模式将行为视为"算法族"，封装成类，让算法的变化独立于使用算法的客户。

}
