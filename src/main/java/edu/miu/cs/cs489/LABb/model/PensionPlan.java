package edu.miu.cs.cs489.LABb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class PensionPlan {

    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContribution;


    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

//    public double getMonthlyContribution() {
//        return monthlyContribution;
//    }


    public void setPlanReferenceNumber(String planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setMonthlyContribution(double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    public String getMonthlyContribution() {
        // Creating NumberFormat instance for US locale
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(java.util.Locale.US);
        return usdFormat.format(monthlyContribution);
    }
}
