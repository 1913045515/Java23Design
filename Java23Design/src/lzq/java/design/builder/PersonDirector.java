package lzq.java.design.builder;

/**
 * Created by qiang on 2017/11/19.
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
