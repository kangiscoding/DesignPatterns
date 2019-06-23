package com.yaokang.patterns.singleton;

/**
 * 4. 双重检查加锁
 */
public class VolatileSingleton {

    private volatile static VolatileSingleton uniqueInstance; // volatile

    private VolatileSingleton() {
    }

    public static VolatileSingleton getInstance() {
        if (uniqueInstance == null) { // 如果不存在，就进入同步区块
            synchronized (VolatileSingleton.class) {
                if (uniqueInstance == null) { // 再次检查，如果是null，才创建实例
                    uniqueInstance = new VolatileSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    // "双重检查加锁"保证了只有在第一次调用getInstance才会同步
    // volatile关键字确保了 当uniqueInstance被初始化成实例时，多个线程正确的处理uniqueInstance变量
}
