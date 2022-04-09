package com.Exercise7;
import java.util.*;

public class Person {
    String nameAyebale57156;
    String surnameAyebale57156;
    String streetAyebale57156;
    String zipCodeAyebale57156;
    String cityAyebale57156;
    Scanner sc = new Scanner(System.in);

    public void initializer() {
        System.out.println("Enter name");
        nameAyebale57156 = sc.nextLine();
        System.out.println("Enter surname");
        surnameAyebale57156 = sc.nextLine();
        System.out.println("Enter street");
        streetAyebale57156 = sc.nextLine();
        System.out.println("Enter zip code");
        zipCodeAyebale57156 = sc.nextLine();
        System.out.println("Enter City");
        cityAyebale57156 = sc.nextLine();

    }

    public void print() {
        System.out.println("Name: " + nameAyebale57156+"\n" +"Surname: " + surnameAyebale57156+"\n"+ "Street:" + streetAyebale57156+"\n"+ "Zip Code: " + zipCodeAyebale57156+"\n"+ "City: " + cityAyebale57156);

    }
}