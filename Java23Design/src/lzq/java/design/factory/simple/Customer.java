package lzq.java.design.factory.simple;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public class Customer {
    public static void main(String[] args) {
        BigFactoryCar bigFactoryCar=new BigFactoryCar();
        BigCar bigCar=bigFactoryCar.createCar();

        SmallFactoryCar smallFactoryCar=new SmallFactoryCar();
        SmallCar smallCar=smallFactoryCar.createCar();
    }
}
