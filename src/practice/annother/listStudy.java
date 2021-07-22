package practice.annother;

import practice.list.addTwoNumbers1;

import java.util.Arrays;
import java.util.HashMap;

public class listStudy {

    public static void main(String[] args) {
        test_0717 t = new test_0717();
        System.out.println(t);
        test_0717 a = t;
        System.out.println(t.a+""+t.name);
        change(a);
        System.out.println(t.a+""+t.name);
    }
    private static void change(test_0717 a){
        a.a = 20;
        a.name = "柳苗";
    }

}
class test_0717{
    int a =10;
    String name = "ss";
}
