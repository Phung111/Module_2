package Test;

public class A {
    static public class B {
    }

    public class C {
    }

    public static void main(String[] args) {
//        A.C o = new A.C();
        A.C o1 = new A().new C();
        A.B o2 = new A.B();
    }
}
