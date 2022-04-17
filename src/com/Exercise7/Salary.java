package com.Exercise7;
import java.util.Scanner;
public interface Salary {
    double salaryToPay(double hours, double rate);

    Scanner sc = new Scanner(System.in);
    public int hours = 8;
    public double rateAyebale = 2.5;
    public double overtimeRateAyebale = rateAyebale * 3;

    default double salaryForOvertimeAyebale(double overtimeRate, int overtimeHours) {
        double salaryAyebale = (overtimeHours * rateAyebale) + (overtimeHours- hours)*(overtimeRateAyebale);
        return salaryAyebale;
    }
    static double employeeBonus(int yearsOfExperience){
        if(yearsOfExperience >= 5){
            return (hours * rateAyebale) * 4;
        }else{
            return (rateAyebale*hours);
        }
    }
}


