import java.util.*;
public class CPSP {
    public static void main(String[] args) {
        System.out.println("Enter Cost Price");
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        System.out.println("Enter Selling Price");
        int sp = sc.nextInt();
        if(sp > cp){
            System.out.println("profit");
        }

        else if (sp == cp){
            System.out.println("no profit");
        }

        else {
            System.out.println("loss");
        }
    }

    
}
