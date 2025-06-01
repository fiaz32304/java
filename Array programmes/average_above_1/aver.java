import java.util.Random;
public class aver{ 
public static void main(String[] args) {
        int [ ]marks={34, 56,67,78,98,90,23,100};
        System.out.println("students grade");
        for(int i=0;i<marks.length;i++){
            System.out.println("student"+(i+1)+"; "+marks[i]);
        }
        int total=0;
        for(int i=0;i<marks.length;i++){
            total=total+marks[i];
        }
        double ave=total/marks.length;
        int min=marks[0];
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("class ave is "+ave);
        System.out.println("the minmum grade is "+min);
        System.out.println("the maximum grade is"+max);
}
}