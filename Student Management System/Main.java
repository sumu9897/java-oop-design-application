class Student {
    private String studentId;
    private String name;
    private double marks;

    public Student(String studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void addBonusMarks(double bonus) {
        marks += bonus;
    }

    public void checkPass() {
        if (marks >= 40) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student("S101", "Sumu", 75);
        s.addBonusMarks(10);
        s.checkPass();
        s.displayStudentInfo();
    }
}
