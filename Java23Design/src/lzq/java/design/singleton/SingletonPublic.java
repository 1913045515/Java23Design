package lzq.java.design.singleton;

/**
 * 共有方法的单例模式
 * Created by linzhiqiang on 2017/11/16.
 */
public class SingletonPublic {
    private static final SingletonPublic instance = new SingletonPublic();

    private SingletonPublic() {
        if(instance!=null && this!=instance){
            try {
                throw new Exception("不能创建两个实例！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static SingletonPublic getInstance() {
        System.out.println("create...........getInstance---function...");
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
