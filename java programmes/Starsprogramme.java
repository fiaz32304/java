/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.starsprogramme;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Starsprogramme {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter teh rows");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println("*");
        }
    }
}
