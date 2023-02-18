import java.util.*;

import javax.lang.model.element.ElementKind;
public class Grade {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the percent");
    int per = sc.nextInt();
    



    if(per<=100 && per > 90){
        System.out.println("A+");
    }

    else if (per <=90 && per >80) {
        System.out.println("A");
    }

    else if (per <=80 && per >70) {
        System.out.println("B+");
    }

    else if (per <=70 && per >60) {
        System.out.println("B");
    }

    else if (per <=60 && per >50) {
        System.out.println("C");
    }

    else if (per <=50 && per >40) {
        System.out.println("D");
    }

    else if (per <=40 && per >30) {
        System.out.println("E");
    }

    else if (per <=30 && per >=0) {
        System.out.println("F");
    }






}
    
}
