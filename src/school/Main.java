package school;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rashid", 26, "Nov22");
//        System.out.println(student1.getAge());
//        student1.setAge(23);
//        System.out.println(student1.getAge());
//        System.out.println(student1.batch);
        Student student2 = student1;
        student2.name = "Zainab";
        System.out.println(student1.name);

    }
}
