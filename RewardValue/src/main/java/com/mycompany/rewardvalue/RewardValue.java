package com.mycompany.rewardvalue;


public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Method to convert cash value to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Method to convert miles value to cash
    private double milesToCash(int miles) {
        return miles * 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }
    public static void main(String[] args){
        
    }
}
