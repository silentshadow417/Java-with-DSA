import java.util.Scanner;
public class Get_ithBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
         System.out.println("Enter i-th posotion: ");
        int i = sc.nextInt();
        int bitMask = (1<<i);
        if((n & bitMask)== 0) 
            System.out.print("i-th position is 0");
        else
            System.out.print("i-th position is 1");
    }
}
