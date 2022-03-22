package com.UserReg.UC6;


import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
    		System.out.println("---Welcome to User Registration System Problem---\n");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter a Number for Validating \nFirst Name - 1, Last Name - 2, "
        			+ "Email - 3, Mobile Number - 4, Password - 5 : ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmail();
                break;
            case 4:
                UserRegistration.validMobileNumber();
                break;
            case 5:
            	UserRegistration.validPassword();
            	break;
        }
    }
}