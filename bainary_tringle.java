public class bainary_tringle {
public static void pattern(int n) {
    for(int i = 1; i<=n; i++) {
        for(int j =1; j<=i; j++){
            if( (i+j) % 2 == 0) {
                System.err.print("1");
            }
            else {
                System.err.print("0");
            }
        }
        System.err.println();
    }
}

    public static void main(String args[]) {
        pattern(5);
    }
}