package lzq.java.design.builder;

/**
 * Created by qiang on 2017/11/19.
 */
public class Test{
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person womanPerson = pd.constructPerson(new ManBuilder());
        Person manPerson = pd.constructPerson(new WomanBuilder());
    }
}
