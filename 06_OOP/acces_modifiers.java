

public class acces_modifiers {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        
    }
    
}
class Student {
    private String name; // Private access modifier
    private int age;     // Private access modifier

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

    

    

