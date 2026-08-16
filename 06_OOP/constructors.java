public class constructors {
    public static void main(String[] args) {
        Students s1 = new Students("John", 20, "Computer Science");
        Students s2 = new Students("Alice", 22, "Mathematics");

        s1.display();
        System.out.println();
        s2.display();
    }
}


class Students{
    String name;
    int age;
    String course;

    Students(String n, int a, String c){
        name = n;
        age = a;
        course = c;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}