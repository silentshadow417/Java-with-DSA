import java.util.*;
public class Prefix_Array {
    public static void Prefix(int num[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for(int i =1; i <prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j =i; j<num.length; j++) {
                int end = j;
                current = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
             
               if(max < current) {
                max = current;
               }
            }
        }
        System.out.println("Total Maximum Sub Array: " + max);
    }

    public static void main(String args[]) {
        int num[] = {2,4,3,9,7};
        Prefix(num);
    }
}
