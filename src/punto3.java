import java.util.Arrays;
import java.util.Random;

public class punto3 {
    static int N=10;
    static int[]number= new int[N];
    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object

        for (int i = 0; i < N; i++) {
            number[i] = rd.nextInt(4);
        }
        System.out.println(Arrays.toString(number));
        System.out.println(""+noCerosAdj(number,N-1));

    }

    public static boolean noCerosAdj(int[] arr,int j){
        if (arr.length==1){
            return true;
        }
        if (j==0){
            return true;
        }
        if (arr[j]==0 ) {
            if (arr[j-1]==0){
                return false;
            }
        }else return noCerosAdj(arr, j-2);


        return true;
    }
}
