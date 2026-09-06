import java.util.*;
public class SelectioShorting {
    public static void Shorting(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1 ;j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }// decending Order
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        Shorting(arr);
        printArr(arr);
    }
}
