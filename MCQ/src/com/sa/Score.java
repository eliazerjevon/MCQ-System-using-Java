
// the result of the test

package com.sa;

public class Score extends ChoseQuiz{

    static int score;

    public static void nameUser() {
        HtmlQuiz quizHtml = new HtmlQuiz();
        JavaQuiz quizJava = new JavaQuiz();
        int correctHtml = quizHtml.right;
        int wrongHtml = quizHtml.wrong;
        int correctJava = quizJava.right;
        int wrongJava = quizJava.wrong;

        switch (chosenQuiz) {
            case (1): // In case user choose HTML
                score = correctHtml * 10;
                System.out.println("Hello " + getName() + ", You have completed the MCQ");
                System.out.println("Your right answer = " + correctHtml);
                System.out.println("Your wrong answer = " + wrongHtml);
                System.out.println("\nYour Score: " + score + "/100");
                break;

            case (2): // In case user choose Java
                score = correctJava * 10;
                System.out.println("Hello " + getName() + ", You have completed the MCQ");
                System.out.println("Your right answers = " + correctJava);
                System.out.println("Your wrong answers = " + wrongJava);
                System.out.println("\nYour Scores: " + score + "/100");
                break;
        }
    }
}