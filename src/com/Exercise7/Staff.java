package com.Exercise7;
import java.util.*;

public class Staff extends Person implements Salary {
    String education;
    String position;
    double hours;
    int yearsOfExperience;

    @Override
    public void initializer() {
        super.initializer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Education");
        education = sc.nextLine();
        System.out.println("Enter the position you are working");
        position = sc.nextLine();

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Education: "+education);
        System.out.println("Position: "+position);

    }

    @Override
    public double salaryToPay(double hours, double rate) {
        return hours*rate;
    }

    @Override
    public double salaryForOvertimeAyebale(double overtimeRate, int hours) {
        return Salary.super.salaryForOvertimeAyebale(overtimeRate, hours);
    }


}
