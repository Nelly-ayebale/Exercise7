package com.Exercise7;
import java.util.*;

public class Staff extends Person {
    String education;
    String position;

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
}
