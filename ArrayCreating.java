  import java.util.*;
public class ArrayCreating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[7];

        name[0] = sc.next();
        name[1] = sc.next();
        name[2] = sc.next();
        name[3] = sc.next();
        name[4] = sc.next();
        name[5] = sc.next();

        System.out.println("1 " + name[0]);
        System.out.println("2 " + name[1]);
        System.out.println("3 " + name[2]);
        System.out.println("4 " + name[3]);
        System.out.println("5 " + name[4]);
        System.out.println("6 " + name[5]);

        sc.close();
    }
}

