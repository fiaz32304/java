/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberclass;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Numberclass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("total num of students");
        int totalstudents=sc.nextInt();
        System.out.println("enter the total subjects");
        int totalsubjects=sc.nextInt();
        int one_subjectnum=10;
        int maxtotalmarks=0;
        int grandtotalmarks=totalstudents*totalsubjects*one_subjectnum;
        
        for(int S=1; S<=totalstudents; S++){
            System.out.println("enter the student "+S+"sub marks");
            for(int sub=1;sub<=totalsubjects;sub++){
                System.out.println(sub+"subjects marks");
                int marks=sc.nextInt();
                maxtotalmarks=maxtotalmarks+marks;
            }
            
        }
        System.out.println("total marks obtained by class"+maxtotalmarks);
        System.out.println("totyal marks of the class"+grandtotalmarks);
          double class_perc =(grandtotalmarks/maxtotalmarks)*100;
          System.out.println("class marks percentage"+class_perc);
          
    }
}
