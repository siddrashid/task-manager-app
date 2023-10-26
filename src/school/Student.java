package school;

public class Student {
    public String name;
    private int age;
    protected String batch;

    public Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public Student(Student other) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}