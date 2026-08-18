public class inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, "Computer Science");
        Student s2 = new Student("Alice", 22, "Mathematics");

        s1.display();
        System.out.println();
        s2.display();
    }
    
}
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}
class Student extends Person {
    String major;

    Student(String n, int a, String m) {
        super(n, a);
        major = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}
