public class BitOddEven {
        public static void main(String args[])
        {
            int
             n = Integer.parseInt(args[0]);
            if((n & 1) == 1 )
                System.out.println("Odd");
            else
                System.out.println("Even");
        }    
}
