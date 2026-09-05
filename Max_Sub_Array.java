import java.util.*;
public class Max_Sub_Array {
    public static void MaxSub(int num[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j =i; j<num.length; j++) {
                int end = j;
                current = 0;
                for(int k = start; k<= end; k++){
                    current += num[k];
                }
                System.out.println(current);
               if(max < current) {
                max = current;
               }
            }
        }
        System.out.println("Total Maximum Sub Array: " + max);
    }

    public static void main(String args[]) {
        int num[] = {20,41,63,89,110};
        MaxSub(num);
    }
}
