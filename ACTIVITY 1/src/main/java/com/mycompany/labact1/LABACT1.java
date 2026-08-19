/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labact1;

/**
 *
 * @author Admin
 */
import java.util.*;
public class LABACT1 {

    public static void main(String[] args) {
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        final int maxSize = 5;
        int nums[] = new int [maxSize];
        ArrayOperations ar = new ArrayOperations();
        
        System.out.println("Sorter Product");
        
        while(choice != 4){ //while loop to continue looping until the user exits (4)
            System.out.println("Options");
            System.out.println("1 - Populate");
            System.out.println("2 - Print");
            System.out.println("3 - Sorting Methods");
            System.out.println("4 - Exit");
            choice = sc.nextInt(); //choice case
            
            switch (choice){
                case 1:
                    ar.populate(nums);
                    choice = 0; //resets choice to 0
                    
                    break;
                case 2:
                    ar.print(nums);
                    choice = 0;
                    
                    break;
                case 3:
                    choice = 0;
                    while(choice != 3){ //inner while loop, choose between Insertion and Bubble sort
            
                        System.out.println("Choose which sort you want: ");
                        System.out.println("1 - Bubble Sort");
                        System.out.println("2 - Insertion Sort");
                        System.out.println("3 - Exit");
                        choice = sc.nextInt();
            
                        switch(choice){
                            case 1:
                                ar.bubbleSort(nums);
                                choice = 0;
                    
                                System.out.println("Bubble Sort!");
                                break;
                            case 2:
                               ar.insertionSort(nums);
                                choice = 0;
                    
                                System.out.println("Insertion Sort!");
                                break;
                                
                            default: //statement if user inputs 3
                                System.out.println("I'm sorry user. I'm afraid I can't do that.");
                                break;
                        }
                    }
                    
                    break;
                
                default: //statement if user inputs 4
                    System.out.println("I'm sorry user. I'm afraid I can't do that.");
                    break;
            }
        }
    }
}
