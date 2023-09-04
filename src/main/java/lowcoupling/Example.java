package lowcoupling;

public class Example {
}

class A {
    private int a;
    private B b;

    public A(int a) {
        this.a = a;
        this.b = new B(this);
    }
}

class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}
