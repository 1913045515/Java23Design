package lzq.java.design.factory.abstracts;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public class FactoryBig implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
