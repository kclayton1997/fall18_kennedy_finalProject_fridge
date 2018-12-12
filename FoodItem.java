/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fridge;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kclay
 */
public class FoodItem {
    String foodName;
    boolean isDairy;
    int startPerc = 100;
    int percRemaining;
    Random rand = new Random();
    boolean isSpoiled;
    Scanner scan = new Scanner(System.in);
    
    public void spoiledFood(){
       int randomCoin = rand.nextInt(2);
       if (randomCoin==1 || foodName == "Beer"){
           isSpoiled = false;
                } else {
           isSpoiled = true;
           System.out.println("The Food is Spoiled");
           System.out.println("Would You Like To Restock? Yes = 1, No = 0");
           int InputInt = scan.nextInt();
           if (InputInt == 1){
               Restock(1);
               isSpoiled = false;
           } else {
               isSpoiled = true;
           }
       }
    }
    
    public void takeFood(int userInput){
        if(userInput == 1){
            int randomInt = rand.nextInt(101);
            percRemaining = startPerc - randomInt;
            System.out.println("You have taken "+randomInt+"% of the selected Item.");
            startPerc = startPerc - randomInt;
        } else {
            percRemaining = 100;
            System.out.println("You have not taken any product.");
        }
    }
    
    public void showStats(){
        System.out.println("*******************************");
        System.out.println("Name Of Food Item: "+foodName);
        if (percRemaining == 0){
        System.out.println("How much is left: 100%");
        } else {
        System.out.println("How much is left: "+percRemaining+"%");
        }
        System.out.println("Is this product dairy? "+isDairy);
        System.out.println("Is the Food Spoiled? "+isSpoiled);
        System.out.println("*******************************");
    }
    
    public void Restock(int userInput){
        if(userInput == 1){
        percRemaining=100;
        System.out.println("Selected Food Item has been restocked");
    } else {
        System.out.println("Food Item has not been restocked");
        }
}
}