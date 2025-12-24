class Course {
    private String courseCode;
    private int enrolledStudents;
    private int maxCapacity;

    public Course(String courseCode, int maxCapacity) {
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    public void enrollStudent() {
        if (enrolledStudents >= maxCapacity) {
            System.out.println("Error: Course is full");
        } else {
            enrolledStudents++;
        }
    }

    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Max Capacity: " + maxCapacity);
    }

    public static void main(String[] args) {
        Course c = new Course("CSE101", 10);
        c.enrollStudent();
        c.enrollStudent();
        c.enrollStudent();
        c.displayCourseInfo();
    }
}
