package lzq.java.design.factory.simple;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public class BigFactoryCar implements FactoryCar{

    @Override
    public BigCar createCar() {
        return new BigCar();
    }
}
