package com.yaokang.patterns.singleton;

/**
 * 3. "急切" 创建单例
 */
public class EagerSingleton {

    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }

    // "急切"创建实例，不用延迟实例化
    // JVM 在加载这个类时马上创建此唯一的单件实例，确保了任何线程访问uniqueInstance之前，一定先创建此实例
}
