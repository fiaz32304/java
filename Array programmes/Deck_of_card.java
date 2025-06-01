import java.util.Random;
public class Deck_of_card {


public static void main(String[] args) {
       Random sc=new Random();
       int []deck=new int [52];
       String[]suits={"Spades","Hearts","diamonds","clubs"};
       String[]ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}; 
//        inititialize cards
       for(int i=0;i<deck.length;i++){
           deck[i]=i;
       }
//        shuffles the cards
       for(int i=0;i<deck.length;i++){
           int index=sc.nextInt(deck.length);
           int temp=deck[i];
           deck[i]=deck[index];
           deck[index]=temp;
           
       }
       for(int person=1;person<=4;person++){
           System.out.println("person"+person);
          for(int i=0;i<4;i++){
           
           String suit=suits[deck[i]/13];
           String rank=ranks[deck[i]%13];
           System.out.println("card number "+deck[i]+" : "+rank+" of "+suit);
       }
    } 
   } 
}