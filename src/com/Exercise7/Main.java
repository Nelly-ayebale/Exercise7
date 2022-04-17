package com.Exercise7;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Person person = new Person();
      person.initializer();
      person.print();


    }

}
class Employee{
    public static void main(String[] args) {
        Staff staff = new Staff();
//        staff.initializer();
//        staff.print();

        double salary = staff.salaryToPay(8,2.5);
        System.out.println("The employee is receiving a total of "+ salary);

        double overtime= staff.salaryForOvertimeAyebale(2.5,12);
        System.out.println("The employee is receiving a total of "+overtime);

        double yearBonus = Salary.employeeBonus(10);
        System.out.println("Total for employee " + yearBonus);
    }
}
