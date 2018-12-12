/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fridge;
import java.util.Scanner;
/**
 *
 * @author kclay
 */
public class Fridge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char quit = 'n';
        while (quit!='y'){
            menu();
            int input = scan.nextInt(); 
        
                switch(input) {
                    case 1:
                        FoodItem Milk = new FoodItem();
                        Milk.foodName = "Milk";
                        Milk.isDairy = true;
                        Milk.spoiledFood();
                        Milk.showStats();
                        System.out.println("Do You want to take some? Yes = 1 No = 0");
                        System.out.println("Press 3 if you wish to return to food selections");
                        int InputInt = scan.nextInt();
                        if(InputInt == 3){
                            break;
                        } else {
                            Milk.takeFood(InputInt);
                            Milk.showStats();
                            askRestock();
                            InputInt = scan.nextInt();
                            Milk.Restock(InputInt);
                            Milk.showStats();
                            break;
                        }
                
                    case 2:
                        FoodItem Eggs = new FoodItem();
                        Eggs.foodName = "Eggs";
                        Eggs.isDairy = false;
                        Eggs.spoiledFood();
                        Eggs.showStats();
                        System.out.println("Do You want to take some? Yes = 1 No = 0");
                        System.out.println("Press 3 if you wish to return to food selections");
                        InputInt = scan.nextInt();
                        if(InputInt == 3){
                            break;
                        } else {
                        Eggs.takeFood(InputInt);
                        Eggs.showStats();
                        askRestock();
                        InputInt = scan.nextInt();
                        Eggs.Restock(InputInt);
                        Eggs.showStats();
                        break;
                        }

                    case 3:   
                        FoodItem Beer = new FoodItem();
                        Beer.foodName = "Beer";
                        Beer.isDairy = false;
                        Beer.spoiledFood();
                        Beer.showStats();
                        System.out.println("Do You want to take some? Yes = 1 No = 0");
                        System.out.println("Press 3 if you wish to return to food selections");
                        InputInt = scan.nextInt();
                        if(InputInt == 3) {
                            break;
                        } else {
                        Beer.takeFood(InputInt);
                        Beer.showStats();
                        askRestock();
                        InputInt = scan.nextInt();
                        Beer.Restock(InputInt);
                        Beer.showStats();
                        break;
                        }
    }
    }
    }
    public static void askRestock() {
        System.out.println("Do you want to restock this item? Yes = 1 No = 0");
}
    public static void menu(){
         System.out.println("Please type what you would like to see");
         System.out.println("1.Milk 2.Eggs 3.Beer");
    }
}

