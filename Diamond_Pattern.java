<<<<<<< HEAD
public class Diamond_Pattern {
    public static void diamond(int n) {
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=(2*i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=n ; i>=1; i--){
            for(int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=(2*i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(5);
    }
}
=======
public class Diamond_Pattern {
    public static void diamond(int n) {
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=(2*i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=n ; i>=1; i--){
            for(int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=(2*i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(5);
    }
}
>>>>>>> c8894456cbc201b9992aa458438f7072f2f66ddc
// (2*i)-1