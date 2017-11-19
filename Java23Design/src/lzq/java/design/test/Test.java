package lzq.java.design.test;

import lzq.java.design.singleton.SingletonEnum;
import lzq.java.design.singleton.SingletonPrivate;
import lzq.java.design.singleton.SingletonPublic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by linzhiqiang on 2017/11/16.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        SingletonPrivate singletonPrivate1= SingletonPrivate.getInstance();
//        SingletonPrivate singletonPrivate2= SingletonPrivate.getInstance();
//        if(singletonPrivate1==singletonPrivate2){
//            System.out.println("一样");
//        }else{
//            System.out.println("不一样");
//        }

        Class clazz = Class.forName("lzq.java.design.singleton.SingletonPublic");
        //注意测试的这个构造函数是private的
        //Constructor c = clazz.getConstructor(List.class);private的构造方法不能这样写，抛出NoSuchMethodException
        Constructor c = clazz.getDeclaredConstructor();
        //不管你的构造函数是什么访问权限，我强制给你打开这个访问权限
        c.setAccessible(true);//暴力反射  注释这一行的话就不行，抛异常
        SingletonPublic o1 = (SingletonPublic)c.newInstance();
        SingletonPublic o2 = (SingletonPublic)c.newInstance();
        if(o1==o2){
            System.out.println("一样");
        }else{
            System.out.println("不一样");
        }


//        SingletonPublic singletonPrivate1= SingletonPublic.getInstance();
//        SingletonPublic singletonPrivate2= SingletonPublic.getInstance();
//        if(singletonPrivate1==singletonPrivate2){
//            System.out.println("一样");
//        }else{
//            System.out.println("不一样");
//        }

//        SingletonEnum s1=SingletonEnum.INSTANCE;
//        SingletonEnum s2=SingletonEnum.INSTANCE;
//        if(s1==s2){
//            System.out.println("一样");
//        }else{
//            System.out.println("不一样");
//        }
    }
}
