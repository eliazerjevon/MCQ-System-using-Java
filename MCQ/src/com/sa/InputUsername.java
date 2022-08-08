
// input username for MCQ

package com.sa;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUsername {

    private static String name;
    private static Scanner username = new Scanner(System.in);
    private static String validationName = "[a-z A-Z]+";

    public static String getValidationName() {
        return validationName;
    }

    public static void setValidationName(String validationName) {
        InputUsername.validationName = validationName;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        InputUsername.name = name;
    }

    public static Scanner getUsername() {
        return username;
    }

    public static void setUsername(Scanner username) {
        InputUsername.username = username;
    }


    public static void nameUser(){
        System.out.println("Use Alphabet only");
        System.out.print("Input your username: ");
        setName(getUsername().nextLine());
        while (!getName().matches(getValidationName())){
            nameUser();
        }
    }

}
