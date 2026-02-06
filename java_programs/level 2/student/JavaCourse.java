
package student;


public class JavaCourse extends Course {

    public JavaCourse(String courseName) {
        super(courseName);
    }

    @Override
    void joinCourse(PojoStudent student) {
        System.out.println("Student Id : "+student.getId());
        System.out.println("Student Name : "+student.getName());
        System.out.println("Joined Course : "+courseName);
    }
    
}
