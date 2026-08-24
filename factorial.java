import java.util.*;
public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++) {
            fact = i * fact;
        }
        System.out.println("Factorial: " + fact);

        sc.close();
    }
}

