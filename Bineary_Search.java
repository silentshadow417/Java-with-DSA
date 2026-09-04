public class Bineary_Search {
    public static int Search(int num[], int key){
        int start = 0, end = num.length-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(num[mid] == key) {
                return mid;
            }
            else if(num[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = {1,5,7,9,13,15,22,35};
        int key = 35;
        System.out.println("Key is: " + Search(num, key));
    }
}
