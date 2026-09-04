import java.util.*;
public class Largest_Number {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0 ; i< number.length; i++){
            if(largest < number[i]) {
                largest = number[i];
            }
            if(smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int number[] = {1,5,6,4,2,7,6,8,0,3};
        System.out.println("Largest Value is: " + getLargest(number));
    }
}
