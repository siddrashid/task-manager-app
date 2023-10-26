package methodOverloading;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.doSomething("Rashid"));
    }

    public int getAge(String name) {
        System.out.println("ABC");
        return 0;
    }

    public int getAge(int age) {
        return 1;
    }
}
