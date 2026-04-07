
package sudentwithdatabse;
import java.sql.*;


public class StudentDAO 
{
    Connection con = DBConnection.getConnection();

    public void insertStudent(int id, String name, int age, String course) {

        try {
            String sql = "INSERT INTO student VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,age);
            ps.setString(4,course);

            ps.executeUpdate();
            System.out.println("Student Inserted Successfully");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void displayStudent() {

        try {
            String sql = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id")+" "+
                        rs.getString("name")+" "+
                        rs.getInt("age")+" "+
                        rs.getString("course")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name) {

        try {
            String sql = "UPDATE student SET name=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,name);
            ps.setInt(2,id);

            ps.executeUpdate();
            System.out.println("Student Updated Successfully");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {

        try {
            String sql = "DELETE FROM student WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,id);
            ps.executeUpdate();

            System.out.println("Student Deleted Successfully");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
