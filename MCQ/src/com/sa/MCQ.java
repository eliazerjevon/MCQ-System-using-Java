
// MCQ System made by KerangkaEL

package com.sa;

public class MCQ {

    public static void main(String[] args) {

        System.out.println("\n \n -----Welcome----- \n");

        //input your username
        InputUsername username = new InputUsername();
        username.nameUser();

        //chose the quiz (html or java)
        ChoseQuiz choose = new ChoseQuiz();
        choose.toChose(); // After the quiz is chosem, it will automatically bring you to the quiz

        //then it will count the right and wrong answer and show the result
        Score mark = new Score();
        mark.nameUser();
    }
}
