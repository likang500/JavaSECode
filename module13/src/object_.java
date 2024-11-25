import java.util.ArrayList;

/**
 * ClassName: object_
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/6 19:34
 * @Version 1.0
 */
public class object_ {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("lk",12);
        Person person2 = new Person("lk",12);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        ArrayList<String> list  = new ArrayList<>();
        System.out.println(person1.equals(list));

        System.out.println(person1.equals(null));

        System.out.println(person1.equals(person1));

        Object o = person1.clone();
        Person person3 = (Person) o;
        System.out.println(person1.equals(person3));
        System.out.println(person1==person3);



        String s1 = "1111";
        String s2 = "1111";
        System.out.println(s1.equals(s2));
        System.out.println(person1.toString());
    }
}
