/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Sacurom
 */
class InPatient extends Patient {
    private int daysStayed;
    private double dailyRate;
    private double medicationCost;
    private boolean hasInsurance;

    public InPatient(String patientId, String name, int age, int daysStayed, double dailyRate, double medicationCost, boolean hasInsurance) {
        super(patientId, name, age);
        this.daysStayed = daysStayed;
        this.dailyRate = dailyRate;
        this.medicationCost = medicationCost;
        this.hasInsurance = hasInsurance;
    }

    public int getDaysStayed() {
        return daysStayed;
    }

    public void setDaysStayed(int daysStayed) {
        this.daysStayed = daysStayed;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getMedicationCost() {
        return medicationCost;
    }

    public void setMedicationCost(double medicationCost) {
        this.medicationCost = medicationCost;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    // Business Logic Methods
    public double calculateRoomCharges() {
        return getDaysStayed() * getDailyRate();
    }

    public double calculateDiscountedMedication() {
        if (getAge() >= 60) {
            return getMedicationCost() * 0.85; // 15% discount for senior citizens
        }
        return getMedicationCost();
    }

    public double calculateGrossTotal() {
        return calculateRoomCharges() + calculateDiscountedMedication();
    }

    public double calculateInsuranceDeduction() {
        if (isHasInsurance()) {
            return calculateGrossTotal() * 0.40; // 40% insurance coverage
        }
        return 0.0;
    }

    public double calculateFinalBill() {
        return calculateGrossTotal() - calculateInsuranceDeduction();
    }
}