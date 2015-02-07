/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple.choice.test;

import java.util.Scanner;

public class MultipleChoiceTest {

    static String usersAnswer;
    static String realAnswer = "A";
    static String False = ("That is incorrect!");
    static String True = ("That is correct!");
    static Scanner input = new Scanner(System.in);
    static int questionNumber = 1;
    static int score = 10;

    public static void main(String[] args) {

        //TODO: Put question here.
        
    }

    public static void askQuestion(Question question) {
        
        question.output();
        
        System.out.println("");
        System.out.print("Your answer: ");
        usersAnswer = input.next();
        
        if(usersAnswer.equalsIgnoreCase(question.getCorrectAnswer())){
            System.out.println(True);
         
        }else{
            System.out.println(False);
            score--;
        }
        
    }

}
