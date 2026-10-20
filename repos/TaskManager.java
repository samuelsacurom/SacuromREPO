/**
* Task Manager
* 1. Add Normal Task
* 2. Add Urgent Task
* 3. View Tasks
* 4. Complete Next Task
* 5. View Next Task
* 6. Exit
* 
*/
 
import java.util.Scanner;
import java.util.LinkedList;
 
public class TaskManager {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        LinkedList<String> tasks = new LinkedList<>();
        int choice;
        do {
            System.out.println("\n==TASK MANAGER==");
            System.out.println("1. Add Normal Task ");
            System.out.println("2. Add Urgent Task ");
            System.out.println("3. ViewTask ");
            System.out.println("4. Complete Next Task ");
            System.out.println("5. View Next Task ");
            System.out.println("6. Exit ");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1 -> {
                    System.out.println("Enter task: ");
                    String task = input.nextLine();
                    tasks.addLast(task);
                    System.out.println("Normal Task added...");
                }
                case 2 -> {
                    System.out.println("Enter task: ");
                    String task = input.nextLine();
                    tasks.addFirst(task);
                    System.out.println("Urgent Task added...");
                }
                case 3 -> {
                    if (tasks.isEmpty()){
                        System.out.println("No pending tasks");                        
                    }else{
                        int number = 1;
                        for (String task : tasks) {
                            System.out.println((number++)+ " ." +task);
                        }
                    }
                }
                case 4 -> {
                    if (!tasks.isEmpty()) {
                        System.out.println("Completed "+tasks.removeFirst());
                    }else{
                        System.out.println("No tasks available...");
                    }
                }
                case 5 -> {
                    if (!tasks.isEmpty()){
                        System.out.println("Next: "+tasks.peekFirst());
                    }else{
                        System.out.println("No Pending tasks ");
                    }
                }
                case 6 -> {
                    System.out.println("Exit");
                }
                default-> System.out.println("Invalid choice: ");
            }
        }while (choice != 6);
        input.close();
    }
}
