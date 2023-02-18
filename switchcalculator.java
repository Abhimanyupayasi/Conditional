import java.util.*;
public class Switchcal {

    public static void main(String[] args) {

        double ans;


        System.out.println("Enter 1st number");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Enter operator - + , - , * , /");
        char op = sc.next().charAt(0);
        System.out.println("Enter 2nd number");
        double num2 = sc.nextDouble();

        switch(op) {


            case '+' : 
            ans = num1+ num2;
            System.out.println(num1 +"+"+ num2 +""+ "=  " + ans);
            break;

            case '-' : 
            ans = num1- num2;
            System.out.println(num1 +"-"+ num2 +""+ "=  " + ans);
            break;

            case '*' : 
            ans = num1* num2;
            System.out.println(num1 +"*"+ num2 +""+ "=  " + ans);
            break;

            case '/' : 
            ans = num1/ num2;
            System.out.println(num1 +"/"+ num2 +""+ "=  " + ans);
            break;





        }


    
        



    }
    
}
