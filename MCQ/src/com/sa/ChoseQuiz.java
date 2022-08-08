
// After input username, user will chose the topic

package com.sa;

import java.util.Scanner;

public class ChoseQuiz extends InputUsername{

    public static int chosenQuiz;

    public static void toChose() {

        //The  users will choose the quiz
        System.out.println("Chose the quiz");
        System.out.println("Input 1 or 2 \n");
        System.out.println("1. HTML");
        System.out.println("2. Java Basic");
        Scanner input = new Scanner(System.in);
        chosenQuiz = input.nextInt();
        System.out.println();

        // After that the system will follow this the condition
        if (chosenQuiz != 1 && chosenQuiz != 2){
            System.out.println("Please enter 1 or 2");
            toChose();
        }

        // this is the action and bring you to the quiz
        if (chosenQuiz == 1) {
            HtmlQuiz.quest();
        } else if (chosenQuiz == 2) {
            JavaQuiz.quest();
        }
    }

}
