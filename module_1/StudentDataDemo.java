package module_1;

import java.util.Scanner;

class StudentData {
    private String name; //  is private; not able to access outside the class.
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String myname) {
        name = myname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int myAge) {
        if (myAge > 0) {
            age = myAge;
        }
    }
}

public class StudentDataDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentData student = new StudentData();

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("\nStudent Data");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        sc.close();

    }
}
