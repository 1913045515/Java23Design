package lzq.java.design.factory.simple;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public class SmallFactoryCar implements FactoryCar {
    @Override
    public SmallCar createCar() {
        return new SmallCar();
    }
}
