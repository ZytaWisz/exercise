package com.company;

import java.util.Scanner;

public class LegalAge {


    public static void main(String[] args){


        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        if (age >= 18 && age <= 123) {
            System.out.println("You're of legal age");
        } else if(age<18){
            System.out.println("You're underage");
        }else{
            System.out.println("Age impossible");
        }
    }
}
