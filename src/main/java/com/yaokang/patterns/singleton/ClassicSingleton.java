package com.yaokang.patterns.singleton;

/**
 * 1. 经典单例
 */
public class ClassicSingleton {

    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton(); // 延迟实例化
        }
        return uniqueInstance;
    }

    // 经典单例模式存在多线程问题, 多线程环境下可能返回不同的对象

}
