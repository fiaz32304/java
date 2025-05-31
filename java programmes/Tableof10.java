/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tableof10;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Tableof10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=10;
        for(int i=1;i<=N;i++){
            System.out.println("the table of"+i);
          for(int j=1;j<=N;j++){
        System.out.println(i+"X"+ j +"="+i*j);
        }
        }
    }
}
