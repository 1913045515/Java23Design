package lzq.java.design.singleton;

/**
 * 枚举方法的单例模式
 * Created by linzhiqiang on 2017/11/16.
 */
public enum SingletonEnum {
    INSTANCE;
    public void disPlay() {
        if (INSTANCE != null) {
            System.out.println("className:" + INSTANCE.getClass().getName());
        } else {
            System.out.println("instance is null");
        }
    }
}
