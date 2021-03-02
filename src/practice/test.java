package practice;

public class test {

}
class Fu {

    int num = 5;

    static void method4() {

        System.out.println("fu method_4");

    }

    void method3() {

        System.out.println("fu method_3");

    }

}

class Zi extends Fu {

    int num = 8;

    static void method4() {

        System.out.println("zi method_4");

    }

    void method3() {

        System.out.println("zi method_3");

    }

}

class DuoTaiDemo4 {

    public static void main(String[] args) {

        Fu f = new Zi();

        System.out.println(f.num);//与父类一致

        f.method4();//与父类一致

        f.method3();//编译时与父类一致，运行时与子类一致

        Zi z = new Zi();

        System.out.println(z.num);

        z.method4();

        z.method3();

    }

}