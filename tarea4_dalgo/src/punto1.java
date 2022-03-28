import java.util.Arrays;
import java.util.Random;

public class punto1 {


    static int[] intPara = new int[40];
    static int T=167 ;
    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object

        for (int i = 0; i < intPara.length; i++) {
           intPara[i] = rd.nextInt(65);
        }
        System.out.println(Arrays.toString(intPara));
        System.out.println(subArraySum(intPara,T,0));

    }

    public static String subArraySum(int[] arr, int T, int i) {
        int suma=0;
        String resp="[";
        int n = arr.length;

        if (T==0){
            return "el numero buscado es 0";
        }
        if (i>=n){// ACABO POSIBLES RECURSIONES
            return "no hay solucion con el conjunto dado";
        }
        for (int j = i; j < n; j++)
        {
            suma += arr[j];
            if (suma>T){
                suma -= arr[j];

            }else {
                resp += "" + arr[j] + ",";
            }
            if (suma == T) {//RESPUESTA
                resp+= "]";
                return resp;
            }

        }
        return subArraySum(arr, T, i+1);//RECURSION
    }

}