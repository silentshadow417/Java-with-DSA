public class Array_loop {
    public static void main(String args[]) {
    
        int num[] = new int[10];
         for(int i = 0 ; i < num.length; i++) {
            num[i] = i + 1;
        }
        for(int i = 0 ; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}