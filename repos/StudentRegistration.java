import java.util.Scanner;
import java.util.ArrayList;
public class StudentRegistration {
    static ArrayList<String> students = new ArrayList<>();
    static Scanner input = new Scanner (System.in);    
    static void addStudent(){
        System.out.print("Enter Student name: ");
        String name = input.nextLine().trim();
        if (name.isEmpty()){
            System.out.println("Name cannot be empty. ");
            return;
        }
        students.add(name);
        System.out.println("Student added successfully.");
    }
    static void displayStudents(){
        if (students.isEmpty()){
            System.out.println("No students registered. ");
            return;
        }
        System.out.println("\nRegistered Students: ");
        for (int i = 0; i<students.size(); i++){
            System.out.println((i+1) + ". "+students.get(i));
        }
    }
    static void searchStudent(){
        System.out.println("Enter name to search: ");
        String name = input.nextLine();
        boolean found = false;
        for (String student : students){
            if (student.equalsIgnoreCase(name)){
                found = true;
                break;
            }
        }
        System.out.println(found ? "Student found! ": "Not found.");
    }
    static void removeStudent(){
        System.out.println("Enter name to remove: ");
        String name = input.nextLine();
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).equalsIgnoreCase(name)){
                students.remove(i);
                System.out.println("Student Removed");
                return;
            }
        }
        System.out.println("Student Not found. ");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==Student Registration==");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchStudent();
                case 4 -> removeStudent();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        }while (choice != 5);
        input.close();
    }
}
