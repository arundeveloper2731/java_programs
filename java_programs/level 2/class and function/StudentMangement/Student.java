class Student {
    String[] names = new String[10];
    int count = 0;

    // Add student
    void addStudent(String name) {
        if (count < names.length) {
            names[count] = name;
            count++;
            System.out.println("Student added successfully!\n");
        } else {
            System.out.println("Student list is full!\n");
        }
    }

    // Update student name
    void updateStudent(int index, String newName) {
        if (index >= 0 && index < count) {
            names[index] = newName;
            System.out.println("Student name updated!\n");
        } else {
            System.out.println("Invalid student index!\n");
        }
    }

    // Display students
    void displayStudents() {
        if (count == 0) {
            System.out.println("No students to display!\n");
            return;
        }

        System.out.println("---- Student List ----");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        System.out.println();
    }
}
