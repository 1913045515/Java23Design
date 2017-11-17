package lzq.java.design.factory.abstracts;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public class FactorySmall implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
