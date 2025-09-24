package TCA;
import java.util.Scanner;

class Course {
    String courseId;
    String courseName;
    int duration;
    static int count = 100;

    // Default Constructor
    Course() {
        count++;
        courseId = "C" + count;
        courseName = "Java Basics";
        duration = 4;
    }

    // Parameterized Constructor
    Course(String name, int weeks) {
        count++;
        courseId = "C" + count;
        courseName = name;
        duration = weeks;
    }

    void showCourse() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
        System.out.println("----------------------------");
    }
}

public class InputConstruct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default course
        Course course1 = new Course();

        // User input for second course
        System.out.print("Enter course name: ");
        String name = sc.nextLine();

        System.out.print("Enter course duration (in weeks): ");
        int weeks = sc.nextInt();

        // Create course with user input
        Course course2 = new Course(name, weeks);

        // Show all course details
        System.out.println("\nCourse Details:\n");
        course1.showCourse();
        course2.showCourse();

        sc.close();
    }
}
