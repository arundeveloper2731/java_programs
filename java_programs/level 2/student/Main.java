
package student;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Student Id : ");
        int id=sc1.nextInt();
        System.out.println("Enter student name : ");
        String name = sc.nextLine();
        
        
        PojoStudent std = new PojoStudent(id,name);
        
        System.out.println("Enter course name : ");
        String coursename=sc.nextLine();
        JavaCourse java = new JavaCourse(coursename);
        java.joinCourse(std);
    }
    
}
