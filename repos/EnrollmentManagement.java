/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author scsacurom
 */
import java.util.Scanner;

enum EnrollmentStatus { ACTIVE, DROPPED }

class EnrollmentException extends Exception {
    public EnrollmentException(String message) {
        super(message);
    }
}

class Learner {
    private final int id;
    private final String name;
    private EnrollmentStatus status;

    public Learner(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = EnrollmentStatus.ACTIVE;
    }

    public int getId() {
        return id; }
    public String getName() { 
        return name; }
    public EnrollmentStatus getStatus() { 
        return status; }

    void setStatus(EnrollmentStatus status) {
        this.status = status; }

    @Override
    public String toString() {
        return id + " " + name + " " + status;
    }
}

class Course {
    private static final int CAPACITY = 3;
    private final Learner[] slots = new Learner[CAPACITY];

    public Learner enroll(int id, String name) throws EnrollmentException {
        if (name == null || name.isBlank()) {
            throw new EnrollmentException("Name cannot be empty.");
        }

        if (findById(id) != null) {
            throw new EnrollmentException("Duplicate learner ID.");
        }
        int free = firstEmptySlot();
        if (free == -1) {
            throw new EnrollmentException("Course is full.");
        }
        Learner learner = new Learner(id, name);
        slots[free] = learner;
        return learner;
    }

    public Learner drop(int id) throws EnrollmentException {
        Learner learner = findById(id);
        if (learner == null) {
            throw new EnrollmentException("Learner not found.");
        }
        if (learner.getStatus() == EnrollmentStatus.DROPPED) {
            throw new EnrollmentException("Learner already dropped.");
        }
        learner.setStatus(EnrollmentStatus.DROPPED); 
        return learner;
    }

    public Learner find(int id) throws EnrollmentException {
        Learner learner = findById(id);
        if (learner == null) {
            throw new EnrollmentException("Learner not found.");
        }
        return learner;
    }

    public void displayAll() {
        boolean any = false;
        for (Learner learner : slots) {
            if (learner != null) {
                System.out.println(learner);
                any = true;
            }
        }
        if (!any) {
            System.out.println("No learners enrolled.");
        }
    }

    private Learner findById(int id) {
        for (Learner learner : slots) {
            if (learner != null && learner.getId() == id) {
                return learner;
            }
        }
        return null;
    }

    private int firstEmptySlot() {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                return i;
            }
        }
        return -1;
    }
}

public class EnrollmentManagement {
    public static void main(String[] args) {
        Course course = new Course();
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu: 1 Enroll | 2 Drop | 3 List | 4 Find | 0 Exit");
            System.out.print("Choice: ");
            String choice = scan.nextLine().trim();

            try {
                switch (choice) {
                    case "1" -> {
                        int id = readInt(scan, "Enter ID: ");
                        System.out.print("Enter name: ");
                        Learner learner = course.enroll(id, scan.nextLine().trim());
                        System.out.println(learner.getStatus());
                    }
                    case "2" -> {
                        int id = readInt(scan, "Enter ID: ");
                        Learner learner = course.drop(id);
                        System.out.println(learner.getStatus());
                    }
                    case "3" -> course.displayAll();
                    case "4" -> {
                        int id = readInt(scan, "Enter ID: ");
                        System.out.println(course.find(id));
                    }
                    case "0" -> {
                        running = false;
                        System.out.println("Goodbye.");
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (EnrollmentException e) {
        
                
                System.out.println("Error: " + e.getMessage());
            }
        }
        scan.close();
    }

    private static int readInt(Scanner in, String prompt) throws EnrollmentException {
        System.out.print(prompt);
        String text = in.nextLine().trim();
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new EnrollmentException("Enter a valid number.");
        }
    }
}