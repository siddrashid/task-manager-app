package ConstructorChaining;

public class C extends B {
    public C() {
        this("Rashid");
        System.out.println("Constructor of C without parameters.");
    }

    public C(String name) {
        System.out.println("Constructor of C with parameters.");
    }
}