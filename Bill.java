import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil price: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter pen price: ");
        float pen = sc.nextFloat();
        System.out.println("Enter Eraser price: ");
        float eraser = sc.nextFloat();
        
        float bill = pencil + pen + eraser;

        float gst = bill * 0.18f;
        float finalBill = gst + bill;
        System.out.println("----Your bill----");
        System.out.println("Total Bill :" + bill);
        System.out.println("GST tax: " + gst);
        System.out.println("Your Bill is: " + finalBill);
        sc.close();
    }
}