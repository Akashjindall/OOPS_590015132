class A {
    A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A {
    B() {
        super();   // only ONE super() call is allowed
        System.out.println("Constructor of class B");
    }
}

public class superchaining {
    public static void main(String[] args) {
        B obj = new B();
    }
}