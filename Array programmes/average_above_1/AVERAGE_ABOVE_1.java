/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.average_above_1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class AVERAGE_ABOVE_1 {
    
    
    
//      AVERAGE AND ABOVE TOTAL NUMBERS
    
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int sum=0;
//        int []marks=new int[7];
//        System.out.println("enter the numbers::");
//        for(int i=0; i<marks.length;i++){
//            marks[i]=sc.nextInt();
//            sum=sum+marks[i];   
//        }
//        double aver=sum/marks.length;
//        int count=0;
//        for(int i=0; i<marks.length;i++){
//            if(marks[i]>aver){
//                count=count+1;     
//            }
//        }
//        System.out.println("the aver marks of class is ::"+aver);
//        System.out.println("the totral num greater then average are::"+count);
    
//   FAIL AND PASS STUDENT ABOVE 50%
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int [] marks=new int [7];
//         int n=1;
//         int pass=0;
//         int fail=0;
//         for(int i=0;i<marks.length;i++){
//             System.out.println("enter the marks student "+n);
//             marks[i]=sc.nextInt();
//             n=n+1;
//         }
//        
//         int total_marks=100;
//         for(int i=0;i<marks.length;i++){
//             if(marks[i]>=50){
//                 pass=pass+1;
//                 
//             }else if(marks[i]<50){
//                 fail=fail+1;
//                         
//                         }   
//             }
//         System.out.println("the pass students::"+pass);
//         System.out.println("the fail students::"+fail);
    
    
//   lowest and highest number
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             int []marks=new int[3];
             String []names=new String [3];
             
             
             
             for(int i=0;i<marks.length;i++){
                 System.out.println("enter the name of student::");
                 names[i]=sc.nextLine();
                 System.out.println("enter the marks ::");
                 marks[i]=sc.nextInt(); 
                 sc.nextLine();        
         }
             int highest_marks=marks[0];
             String highest_names=names[0];
             
             int lowest_marks=marks[0];
             String lowest_names=names[0];
             for(int i=0;i<marks.length;i++){
                 if(marks[i]>highest_marks){
                     highest_marks=marks[i];
                     highest_names=names[i];   
                 }
                 if(marks[i]<lowest_marks){
                     lowest_marks=marks[i];
                     lowest_names=names[i];
                 }
             }
             System.out.println("the highest::"+highest_marks+" by "+highest_names);
             System.out.println("the lowest:: "+lowest_marks+" by "+lowest_names);
         
         }       
}
