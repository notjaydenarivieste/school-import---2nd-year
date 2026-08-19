/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labact1;

/**
 *
 * @author Admin
 */
import java.util.*;

public class ArrayOperations {
    
    Scanner sc = new Scanner(System.in);
    
    public ArrayOperations(){
        
    }
    public void populate(int myArray[]){
        System.out.println("Enter " + myArray.length +" integers.");
        for(int a=0; a <= myArray.length - 1; a++){
            myArray[a] = sc.nextInt();
        }
    }
    
    public void print(int myArray[]){
        System.out.println("--------------");
        for(int a=0; a<= myArray.length - 1; a++){
            System.out.println(myArray[a] + " ");
        }
    }
    
    public void bubbleSort(int myArray[]){
        System.out.println("Bubble Sort!");
        int comparisonsToMake, temp;
        comparisonsToMake = myArray.length - 1;
        
        for(int a=0; a< myArray.length - 1; a++){
            for(int b=0; b< comparisonsToMake; b++){
                if(myArray[b] > myArray[b+1]){
                    temp = myArray[b];
                    myArray[b] = myArray[b+1];
                    myArray[b+1] = temp;
                    print(myArray);
                }
            }
            --comparisonsToMake;
        }
    }
    
    public void insertionSort(int myArray[]){
        System.out.println("Insetion Sort!");
        int temp;
        int a = 1;
        
        while(a < myArray.length){
            temp = myArray[a];
            int b = a - 1;
            while(b >= 0 && myArray[b] > temp){
                myArray[b+1] = myArray[b];
                --b;
            }
            myArray[b+1] = temp;
            ++a;
            print(myArray);
        }
    }

}
