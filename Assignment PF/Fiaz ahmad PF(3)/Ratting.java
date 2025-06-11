/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ratting;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ratting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] ratting=new int [20];
        int [] frequency=new int [6];
        System.out.println("enter the values 1 to 5");
        for(int i=0;i<ratting.length;i++){
            System.out.println("enter the values or rating "+(i+1));
            ratting[i]=sc.nextInt();
            
            if(ratting[i]>=1 && ratting[i]<=5){
                frequency[ratting[i]]=frequency[ratting[i]]+1;
            }else{
                System.out.println("invalid number :");
                break;
            }
        }
            for(int i=1;i<=5;i++){
                System.out.println(i+" ratting "+frequency[i]+" times");
                
            }
            
        }
        
    }
    

