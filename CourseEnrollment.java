/**
* Course Enrollement
* 1. Enroll Course
* 2. Display Course
* 3. Check Course
* 4. Remove Course
* 5. Exit
*/
 
 
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class CourseEnrollment {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set <String> courses = new HashSet<>();
        int choice; 
        do {
            System.out.println("\nCourse Enrollment");
            System.out.println("1. Enroll Course");
            System.out.println("2. Display Course");
            System.out.println("3. Check Course");
            System.out.println("4. Remove Course");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
 
 
            choice = input.nextInt();
            input.nextLine();
 
            switch(choice) {
                case 1 -> {
                    System.out.print("Course Code: ");
                    String code = input.nextLine().trim().toUpperCase();
 
                    if (code.isEmpty()){
                        System.out.println("Course code is required");
                    }else if (courses.add(code)){
                        System.out.println("Enrollment Successful.");
                    }else{
                        System.out.println("Already enrolled ");
                    }
                }
                case 2 -> {
                    System.out.println("Enrolled course ");
                    if (courses.isEmpty()){
                        System.out.println("No Courses");
                    }
                    for (String course : courses) {
                        System.out.println("- "+course);
                    }
                    System.out.println("Total course: "+courses.size());    
                }
                case 3 -> {
                    System.out.println("Enter course code: ");
                    String code = input.nextLine().trim().toUpperCase();
                    System.out.println(courses.contains(code)?"Course Exist" :"Not Found");
                }
                case 4 -> {
                    System.out.println("Course to remove ");
                    String code = input.nextLine().trim().toUpperCase();
                    System.out.println(courses.remove(code)?"Course Remove" :"Not Found");
 
                }
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
 
            }
            }while (choice!=5);
        input.close();
    }
 
}
