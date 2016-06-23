package com.example.diu.salarycalculation;


import java.security.PrivateKey;

public class SalaryCalculator {

    private  double basicSalary;
    private float medicalAmount;
    private float houseRent;



   public SalaryCalculator(double basicSalary, float medicalAmount, float houseRent){
       setBasicSalary(basicSalary);
       setMedicalAmount(medicalAmount);
       setHouseRent(houseRent);
   }

    public SalaryCalculator(){


    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getMedicalAmount() {
        return medicalAmount;
    }

    public void setMedicalAmount(float medicalAmount) {
        this.medicalAmount = medicalAmount;
    }

    public float getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(float houseRent) {
        this.houseRent = houseRent;
    }


    public double CalculateTotalSalary(){

        double totalSalary=getBasicSalary()+(getBasicSalary()*getMedicalAmount())/100+(getBasicSalary()*getHouseRent())/100;
        return totalSalary;
    }
}
