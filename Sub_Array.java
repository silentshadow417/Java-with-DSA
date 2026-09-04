import java.util.*;
public class Sub_Array {
    public static void Sub(int num[]) {
        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j =i; j<num.length; j++) {
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
             System.out.println();
        }
    }

    public static void main(String args[]) {
        int num[] = {20,41,63,89,110};
        Sub(num);
    }
}
