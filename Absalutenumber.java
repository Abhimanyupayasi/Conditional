import java.util.*;
public class Absalute {

    public static void main(String args[]) {

        System.out.println("Enter the Number");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();;

        if(a < 0) {
            a = a * (-1);

        }

        System.out.println(a);
        



    }
    
}
