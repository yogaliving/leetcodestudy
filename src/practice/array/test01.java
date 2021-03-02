package practice.array;


public class test01 {
    public static void main(String[] args) {
        System.out.println("000");
        new B();
    }
}
class A{
    public A(){
        System.out.println("A 构造函数");
    }
    private static A a=new A();
    static {
        System.out.println("static");
    }
    {
        System.out.println("A1");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
}

