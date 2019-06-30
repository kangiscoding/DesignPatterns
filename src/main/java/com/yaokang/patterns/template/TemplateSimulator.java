package com.yaokang.patterns.template;

public class TemplateSimulator {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

    }

    // 模板方法：在超类中定义算法骨架，部分实现延迟到子类中。模板方法中的步骤，部分可以超类实现，部分可以子类中实现。
    // 客户端代码只依赖高层超类的抽象，不依赖底层类的具体实现。(好莱坞原则)
}
