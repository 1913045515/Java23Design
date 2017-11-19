package lzq.java.design.builder;

/**
 * Created by qiang on 2017/11/19.
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
