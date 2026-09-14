/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;

/**
 *
 * @author WW326
 */
import java.util.*;
public class ACTIVITY2 {

    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input row: ");
        int x = sc.nextInt();
        
        System.out.print("Input column: ");
        int y = sc.nextInt();
        //input columns and rows
        
        int scores[][] = new int [x][y];
        
        //methods
        arr.populate(scores);
        arr.print(scores);
        arr.oddSum(scores);
    }
}
