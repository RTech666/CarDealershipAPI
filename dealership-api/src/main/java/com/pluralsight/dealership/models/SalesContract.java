package com.pluralsight.dealership.models;

public class SalesContract extends Contract {
    // Create veriable, as private.
    private double downPayment;

    // Create the constructor.
    public SalesContract(int ID, String contractType, String contractDate, String customerName, String customerEmail, String vehicleVIN, int vehicleYear, String vehicleMake, String vehicleModel, String vehicleType, String vehicleColor, int vehicleOdometer, double vehiclePrice, double totalPrice, double salesTax, double recordingFee, double processingFee, double leaseFee, String financeOption, double monthlyPayment, Vehicle vehicleSold, double downPayment) {
        super(ID, contractType, contractDate, customerName, customerEmail, vehicleVIN, vehicleYear, vehicleMake, vehicleModel, vehicleType, vehicleColor, vehicleOdometer, vehiclePrice, totalPrice, salesTax, recordingFee, processingFee, leaseFee, financeOption, monthlyPayment);
        this.downPayment = downPayment;
    }

    // Create getter and setter.
    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    // Create calculateRemainingBalance method.
    public double calculateRemainingBalance() {
        return getTotal() - downPayment;
    }
}