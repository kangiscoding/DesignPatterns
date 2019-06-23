package com.yaokang.patterns.singleton;

/**
 * 2. Synchronized 同步单例
 */
public class SyncSingleton {

    private static SyncSingleton uniqueInstance;

    private SyncSingleton() {
    }

    public static synchronized SyncSingleton getInstance() { // 使用synchronized
        if (uniqueInstance == null) {
            uniqueInstance = new SyncSingleton();
        }
        return uniqueInstance;
    }
    // 使用synchronized同步能解决多线程问题, 保证线程安全，但是会造成性能损失，因为每次调用此方法都要同步，对于频繁
    // 调用getInstance方法的程序，执行效率会下降。
}
