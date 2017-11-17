package lzq.java.design.factory.abstracts;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public class Customer {
    public static void main(String[] args){
        FactoryBig factoryBig = new FactoryBig();
        factoryBig.createEngine();
        factoryBig.createAircondition();

        FactorySmall factorySmall = new FactorySmall();
        factorySmall.createEngine();
        factorySmall.createAircondition();
    }
}
