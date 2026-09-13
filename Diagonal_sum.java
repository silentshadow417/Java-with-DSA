public class Diagonal_sum {
    public static int Dia_Sum(int matrix[][]){
        int sum = 0;
        /*wrost time complexcity
        for (int  i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }// sum
        }
        return sum;*/
        for(int i=0;i<matrix.length;i++){
            sum+= matrix[i][i]; // Primary diagonal
            //Secondary diagonal
            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        System.out.println(Dia_Sum(matrix));
    }
}
