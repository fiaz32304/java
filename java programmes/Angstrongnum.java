/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.angstrongnum;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Angstrongnum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enyter the the num");
        int num=sc.nextInt();
        int orignalnum=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if (sum==orignalnum){
            System.out.println("the angstrongnum is::"+orignalnum);
        }else{
            System.out.println("not angstrongnum::" + orignalnum);
        }
        
    }
}
