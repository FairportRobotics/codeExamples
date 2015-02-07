/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiple.choice.test;

import java.util.ArrayList;

/**
 *
 * @author robo
 */
public class Question {
    
    ArrayList<String> choices = new ArrayList<String>();
    String correctAnswer;
    String question;
    
    public Question(String answer, String question){
        this.correctAnswer = answer;
        this.question = question;
    }
    
    public void addChoice(String choice){ 
        choices.add(choice);
    }
    
    public void output(){
        
        System.out.println(question);
        System.out.println("");
        
        for(int i=0;i<choices.size();i++){
            
            if(i == 0){
                System.out.println("A - " + choices.get(i));
            }else if(i == 1){
                System.out.println("B - " + choices.get(i));
            }else if(i == 2){
                System.out.println("C - " + choices.get(i));
            }else if(i == 3){
                System.out.println("D - " + choices.get(i));
            }
            
        }
        
    }
    
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    
    
    
}
