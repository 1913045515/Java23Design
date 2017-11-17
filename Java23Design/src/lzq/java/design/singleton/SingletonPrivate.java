package lzq.java.design.singleton;

import java.util.Random;

/**
 * 私有方法的单例模式
 * Created by linzhiqiang on 2017/11/16.
 */
public class SingletonPrivate {
    private static volatile SingletonPrivate instance = null;

    private SingletonPrivate() {
        System.out.println("create...........SingletonPrivate");
    }

    public static SingletonPrivate getInstance() {
        if (instance == null) {
            synchronized (SingletonPrivate.class) {
                if (instance == null) {
                    instance = new SingletonPrivate();
                }
            }
        }
        return instance;
    }

    public void disPlay() {
        if (instance != null) {
            System.out.println("className:" + instance.getClass().getName());
        } else {
            System.out.println("instance is null");
        }
    }
}
