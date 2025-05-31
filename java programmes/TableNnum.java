/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablennum;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class TableNnum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int N=sc.nextInt();
        for(int i=1;i<=10;++i){
        System.out.println(N+"x"+i+"="+N*i);
        }
    }
}
