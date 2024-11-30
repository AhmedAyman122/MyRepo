/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.start;

import java.util.Scanner;

/**
 *
 * @author user
 */


class Number {

    private int number; 

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}

class PrimeChecker extends Number {
    public boolean isPrime() {
        int input = getNumber();
        if(input <= 1) {
            return false;
        }
         for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false; // إذا كان له قاسم غير نفسه
            }
        }
        return true;
       
}
}

public class Start {

    private static Object scanner;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        PrimeChecker primeChecker = new PrimeChecker();
        
        System.out.print("Enter Your Number :");
        int inputNumber = in.nextInt();
        primeChecker.setNumber(inputNumber);
        
        if (primeChecker.isPrime()) {
            System.out.println(inputNumber + " prime number:");
        } else {
            System.out.println(inputNumber + " Not prime number ");
        }
    }
}

