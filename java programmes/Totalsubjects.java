/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalsubjects;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Totalsubjects {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the subjects:");
        int subjects=sc.nextInt();
        int totalmarks=0;
        for(int i=1; i<=subjects; i++){
            System.out.println("enter the subject marks:"+i);
            int marks=sc.nextInt();
            totalmarks=totalmarks+marks;
        }
        System.out.println("total marks:"+totalmarks);
    }
}
