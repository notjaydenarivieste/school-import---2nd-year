package com.mycompany.activity2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WW326
 */
import java.util.*;
public class ArrayOperations {
    Scanner sc = new Scanner(System.in);
    
    public ArrayOperations(){ 
        
    }
    
    //populate method
    public void populate(int matrix[][]){
        System.out.println("Enter " + matrix.length*matrix[0].length + " Integers: ");
        
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }
    }
    
    //printing method
    public void print(int matrix[][]){
        System.out.println("Printing 2D Array...");
        
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print("\t" + matrix[row][col]);
            }
            System.out.println("");
        }
    }
    
    //displays the matrix and the sum of the odd elemnts of a row
    public void oddSum(int matrix[][]){
        System.out.println("Adding Odd Elements...");
        
        for(int row = 0; row < matrix.length; row++){
            int sum = 0;
            
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print("\t" + matrix[row][col]);
                
                if(matrix[row][col] % 2 == 1){
                    sum += matrix[row][col];
                }
            }
            System.out.print("\t Sum of odd in row " + matrix.length+1 + " : " + sum);
            System.out.println("");
        }
    }
}
