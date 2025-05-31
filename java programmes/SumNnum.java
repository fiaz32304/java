/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumnnum;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class SumNnum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entyer the num N::");
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;++i){
            sum=sum+i;
        }
        System.out.println("the sum of alla natural num till N::"+sum);
    }
}
