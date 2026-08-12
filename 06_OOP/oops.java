

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John" ;
        s1.age = 20 ;
        s1.rollno = 1 ;

        s1.printDetails();

    }

    public static class Student {
        String name ;
        int age ;
        int rollno ;

        public void printDetails(){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Roll No : " + rollno);
        }
        
    }
}
