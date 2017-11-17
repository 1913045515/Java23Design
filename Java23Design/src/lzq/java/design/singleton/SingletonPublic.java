package lzq.java.design.singleton;

/**
 * 共有方法的单例模式
 * Created by linzhiqiang on 2017/11/16.
 */
public class SingletonPublic {
    private static volatile SingletonPublic instance = null;

    public SingletonPublic() {
        System.out.println("create...........SingletonPrivate");
    }

    public static SingletonPublic getInstance() {
        if (instance == null) {
            synchronized (SingletonPublic.class) {
                if (instance == null) {
                    instance = new SingletonPublic();
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
