
package student;


public abstract class Course {
   protected String courseName;
   
   Course(String courseName){
       this.courseName = courseName;
   }
   abstract void joinCourse(PojoStudent student);
   
   
}
