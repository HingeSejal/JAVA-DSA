package Lab;

class Course {
    // Variables to store course details
    String courseId;
    String courseName;
    int duration;

    // Static variable to generate unique ID numbers
    static int count = 100;

    // Default Constructor
    Course() {
        count++;
        courseId = "C" + count;  // Auto-generate ID
        courseName = "Java Basics";  // Default name
        duration = 4;  // Default duration in weeks
    }

    // Parameterized Constructor
    Course(String name, int weeks) {
        count++;
        courseId = "C" + count;  // Auto-generate ID
        courseName = name;
        duration = weeks;
    }

    // Method to display course details
    void showCourse() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
        System.out.println("-------------------------");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Create course using default constructor
        Course course1 = new Course();

        // Create course using parameterized constructor
        Course course2 = new Course("Python Programming", 6);
        Course course3 = new Course("Web Development", 8);

        // Show course details
        course1.showCourse();
        course2.showCourse();
        course3.showCourse();
    }
}
