class StudentGrade {
    public static void main(String[] args) {
        int marks1 = 95;
        int marks2 = 85;
        int marks3 = 65;
        int marks4 = 40;
        int marks5 = 20;

        assignGrade(marks1);
        assignGrade(marks2);
        assignGrade(marks3);
        assignGrade(marks4);
        assignGrade(marks5);
    }

    public static void assignGrade(int marks) {
        if (marks > 90) {
            System.out.println(marks + " - A grade");
        } else if (marks > 70) {
            System.out.println(marks + " - B grade");
        } else if (marks > 50) {
            System.out.println(marks + " - C grade");
        } else if (marks > 25) {
            System.out.println(marks + " - D grade");
        } else {
            System.out.println(marks + " - Fail");
        }
    }
}
