/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalmarks;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Totalmarks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total students:");
        int stu=sc.nextInt();
        System.out.println("enter the totsl subjects:");
        int sub=sc.nextInt();
        int onesubjectno=10;
        double obtmarks=0;
        double totalmarksno=stu*sub*onesubjectno;
        for(int i=1;i<=stu;i++){
            System.out.println(i+"student marks:");
            for(int j=1;j<=sub;j++){
                System.out.println(j+"sunject marks:");
                int marks=sc.nextInt();
                obtmarks=obtmarks+marks;
                
            }
        }
        double perc=(obtmarks/totalmarksno)*100;
        System.out.println("the percentage of the class marks"+perc);
        System.out.println("the totalmarks are:"+totalmarksno);
        System.out.println("the obtained marks are:"+obtmarks);
    }
}
