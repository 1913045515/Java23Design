package lzq.java.design.factory.abstracts;

/**
 * Created by Lizhihua on 2017/11/16.
 */
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
