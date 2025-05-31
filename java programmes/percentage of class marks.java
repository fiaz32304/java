/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loop8;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Loop8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("total number of students:");
        int totalstu=sc.nextInt();
        System.out.println("total number of subjects:");
        int totalsub=sc.nextInt();
        int onesub_marks=10;
        double total_No=totalstu*totalsub*onesub_marks;
        double totalsubjectmarks=0;
        for(int S=1; S<=totalstu; S++){
            System.out.println(S+" student");
            for(int B=1; B<=totalsub; B++){
                System.out.println("student subject marks:"+B);
                int marks=sc.nextInt();
                totalsubjectmarks=totalsubjectmarks+marks;
            }
                
        }
        double perc=(totalsubjectmarks/total_No)*100;
        System.out.println("total marks of class:"+total_No);
        System.out.println("total obtained marks of class:"+totalsubjectmarks);
        System.out.println("rhe total percentage of the class marks:"+perc);
        
        
    }
}
