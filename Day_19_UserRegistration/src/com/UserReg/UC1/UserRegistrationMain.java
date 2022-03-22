package com.UserReg.UC1;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
    		System.out.println("---Welcome to User Registration System Problem---\n");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter a Number for Validating \nFirst Name - 1: ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
        }
    }
}