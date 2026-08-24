import java.util.*;
public class PositiveORNegetive {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Number is Positive");
        }
        else if (num < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}
