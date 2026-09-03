<<<<<<< HEAD
public class holow_rhombus {
    public static void rhombus (int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i) ; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n;j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombus(5);
    }
}
=======
public class holow_rhombus {
    public static void rhombus (int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i) ; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n;j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }

public static void main(String args[]){
    rhombus(5);
}


}
>>>>>>> c8894456cbc201b9992aa458438f7072f2f66ddc
