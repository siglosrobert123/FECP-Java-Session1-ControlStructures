package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final String REGULAR = "Regular";
        final String VIP = "VIP";
        final String PREMIUM = "Premium";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membership = scanner.nextLine();

        if (!membership.equalsIgnoreCase(REGULAR) && !membership.equalsIgnoreCase(VIP) && !membership.equalsIgnoreCase(PREMIUM)){
            System.out.println("Invalid membership status entered.");
            return;
        }

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        float price = 0.0f;

        if (membership.equalsIgnoreCase(REGULAR)){
            if(age < 18){
                price = 50;
            }else if(age >= 18 && age <= 64 ){
                price = 100;
            }else{
                price = 75;
            }
        } else if (membership.equalsIgnoreCase(VIP)){
            if(age < 18){
                price = 75;
            }else if(age >= 18 && age <= 64 ){
                price = 150;
            }else{
                price = 112.5f;
            }
        }else if (membership.equalsIgnoreCase(PREMIUM)){
            if(age < 18){
                price = 100;
            }else if(age >= 18 && age <= 64 ){
                price = 200;
            }else{
                price = 150;
            }
        }
        System.out.print("Price: $");
        System.out.printf("%.2f", price);
    }
}