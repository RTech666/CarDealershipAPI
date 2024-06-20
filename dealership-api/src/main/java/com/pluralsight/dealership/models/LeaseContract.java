package com.pluralsight.dealership.models;

public class LeaseContract extends Contract {
    private int leaseTerm;

    // Constructor
    public LeaseContract(int ID, String contractType, String contractDate, String customerName, String customerEmail, String vehicleVIN, int vehicleYear, String vehicleMake, String vehicleModel, String vehicleType, String vehicleColor, int vehicleOdometer, double vehiclePrice, double totalPrice, double salesTax, double recordingFee, double processingFee, double leaseFee, String financeOption, double monthlyPayment, Vehicle vehicleSold, int leaseTerm) {
        super(ID, contractType, contractDate, customerName, customerEmail, vehicleVIN, vehicleYear, vehicleMake, vehicleModel, vehicleType, vehicleColor, vehicleOdometer, vehiclePrice, totalPrice, salesTax, recordingFee, processingFee, leaseFee, financeOption, monthlyPayment);
        this.leaseTerm = leaseTerm;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public double calculateLeasePayment() {
        return getTotal() / leaseTerm;
    }
}