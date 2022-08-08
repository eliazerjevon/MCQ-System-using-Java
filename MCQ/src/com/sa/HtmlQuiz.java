
// topic of MCQ

package com.sa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HtmlQuiz extends ChoseQuiz {

    public static String filename = "src\\com\\CSV\\HTML.csv"; // where the file stored
    public static String lineBreak;                            // use to split the csv file
    public static String theAnswer;                            // input your answer
    public static String rightAnswer;                          // the correct answer
    public static int right = 0;                               // count right answer
    public static int wrong = 0;                               // count wrong answer

    public static void quest() {

        try (BufferedReader buffread = new BufferedReader(new FileReader(filename))) { // get the filename

            while ((lineBreak = buffread.readLine()) !=null) {
                String[] split = lineBreak.split(";");
                System.out.println(split[0]);
                for (int i = 1; i < 5; i++) {
                    System.out.println("\t" + split[i]); //print all the options
                }

                System.out.print("\n Answer: ");
                Scanner answer = new Scanner(System.in);
                theAnswer = answer.next();

                //Validate the answer. must be A, B, C, or D.
                while (!(theAnswer.equals("A") || theAnswer.equals("B") || theAnswer.equals("C") || theAnswer.equals("D") || theAnswer.equals("a") || theAnswer.equals("b") || theAnswer.equals("c") || theAnswer.equals("d"))) {
                    System.out.println("Enter A, B, C, or D");
                    System.out.print("Answer: ");
                    theAnswer = answer.next();
                }


                // Make the letter become the value
                if (theAnswer.equalsIgnoreCase("A") ) {
                    rightAnswer = split[1] + split[6];
                } else if (theAnswer.equalsIgnoreCase("B")) {
                    rightAnswer = split[2] + split[6];
                } else if (theAnswer.equalsIgnoreCase("C")) {
                    rightAnswer = split[3] + split[6];
                } else if (theAnswer.equalsIgnoreCase("D")) {
                    rightAnswer = split[4] + split[6];
                }

                // count the correct answer
                if (rightAnswer.equals(split[5])) {
                    System.out.println("Correct! \n");
                    right++;
                } else {
                    System.out.println("Incorrect! The answer is " + split[5] + "\n");
                    wrong++;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
