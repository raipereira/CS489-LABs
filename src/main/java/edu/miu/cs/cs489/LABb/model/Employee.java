package edu.miu.cs.cs489.LABb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private double yearlySalary;
    PensionPlan pensionPlan;

    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

//    public double getYearlySalary() {
//        return yearlySalary;
//    }

    public String getYearlySalary() {
        // Creating NumberFormat instance for US locale
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(java.util.Locale.US);
        return usdFormat.format(yearlySalary);
    }

    public PensionPlan getPensionPlan() {
        return pensionPlan;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void setPensionPlan(PensionPlan pensionPlan) {
        this.pensionPlan = pensionPlan;
    }
}
