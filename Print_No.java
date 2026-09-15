public class Print_No {
    // Print Number in Increasing order Using Recursion
    public static void printIncreasing(int n){
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

     public static void printDecrising(int n){
         if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecrising(n-1);
    }

    public static void main(String args[]){
        int n =15;
        System.out.println("Number in Incresing order");
        printIncreasing(n);
        System.out.println();
        System.out.println("Number in Decrising order");
        printDecrising(n);
    }
}
