package com.pluralsight.dealership.models;

public abstract class Contract {
    // Create variables, as private.
    private int ID;
    private String contractType;
    private String contractDate;
    private String customerName;
    private String customerEmail;
    private String vehicleVIN;
    private int vehicleYear;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleType;
    private String vehicleColor;
    private int vehicleOdometer;
    private double vehiclePrice;
    private double totalPrice;
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private double leaseFee;
    private String financeOption;
    private double monthlyPayment;

    // Create the constructor.
    public Contract(int ID, String contractType, String contractDate, String customerName, String customerEmail, String vehicleVIN, int vehicleYear, String vehicleMake, String vehicleModel, String vehicleType, String vehicleColor, int vehicleOdometer, double vehiclePrice, double totalPrice, double salesTax, double recordingFee, double processingFee, double leaseFee, String financeOption, double monthlyPayment) {
        this.ID = ID;
        this.contractType = contractType;
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleVIN = vehicleVIN;
        this.vehicleYear = vehicleYear;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.vehicleColor = vehicleColor;
        this.vehicleOdometer = vehicleOdometer;
        this.vehiclePrice = vehiclePrice;
        this.totalPrice = totalPrice;
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.leaseFee = leaseFee;
        this.financeOption = financeOption;
        this.monthlyPayment = monthlyPayment;
    }

    // Create the getters.
    public int getID() {
        return ID;
    }

    public String getContractType() {
        return contractType;
    }

    public String getDate() {
        return contractDate;
    }

    public String getName() {
        return customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public String getVIN() {
        return vehicleVIN;
    }

    public int getYear() {
        return vehicleYear;
    }

    public String getMake() {
        return vehicleMake;
    }

    public String getModel() {
        return vehicleModel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return vehicleColor;
    }

    public int getOdometer() {
        return vehicleOdometer;
    }

    public double getPrice() {
        return vehiclePrice;
    }

    public double getTotal() {
        return totalPrice;
    }

    public double getTax() {
        return salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public String getFinanceOption() {
        return financeOption;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}