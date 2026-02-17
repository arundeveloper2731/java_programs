package studentmarkssystem;

public class Student {
      private int marks;

    public void setMarks(int marks) throws InvalidMark {

        if (marks < 0 || marks > 100) {
            throw new InvalidMark(
                    "Marks must be between 0 and 100!");
        }

        this.marks = marks;
        System.out.println("Marks stored successfully!");
    }

    public int getMarks() {
        return marks;
    }
}