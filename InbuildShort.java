import java.util.*;
public class InbuildShort {
    public static void main(String args[]) {
        int arr[] = {5,3,6,4,2,7,1,9,8,10};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();
        
        int arrs[] = {5,3,6,4,2,7,1,9,8,10};
        Arrays.sort(arrs);
        Arrays.sort(arrs, 3, 8);

        int[] subArray = Arrays.copyOfRange(arrs, 5, 9); 
        System.out.print(Arrays.toString(subArray)); 
         System.out.println();
         Integer arrays[] = {5,3,6,4,2,7,1,9,8,10};
         Arrays.sort(arrays,Collections.reverseOrder());
          System.out.print(Arrays.toString(arrays)); 
    }
    
}
