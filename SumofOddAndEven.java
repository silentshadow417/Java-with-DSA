import java.util.*;
public class SumofOddAndEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        System.out.println("Enter number: ");
        int  count = sc.nextInt();

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            
            if (num % 2 == 0) {
                even += num; 
            } else {
                odd += num;  
            }
        }
        
        System.out.println("Sum of even integers: " + even);
        System.out.println("Sum of odd integers: " + odd);
        
        sc.close();
    }
}
