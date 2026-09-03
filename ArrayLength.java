import java.util.*;
public class ArrayLength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[15];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();

        System.out.println("1 " + marks[0]);
        System.out.println("2 " + marks[1]);
        System.out.println("3 " + marks[2]);
        System.out.println("4 " + marks[3]);
        System.out.println("5 " + marks[4]);
        System.out.println("6 " + marks[5]);

        System.out.println("Length of Array: " + marks.length);
        sc.close();
    }
}

