package com.UserReg.UC1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName(){
        	System.out.println("\nEnter First Name: ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("\nFirst Name is Valid");
        else
            System.out.println("\nFirst Name is Invalid");
    }
}