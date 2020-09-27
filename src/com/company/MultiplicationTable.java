package com.company;


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Write a number: ");
        int firstNumber=scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(firstNumber+ " x "+i+ " = "+ firstNumber * i);
        }


           }
        }


