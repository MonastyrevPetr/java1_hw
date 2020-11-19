import java.util.Arrays;
import java.util.Random;

public class hw2 {
    public static void main(String[] args) {
        int[] arr_1 =  { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr_1.length; i++) {
            if (arr_1[i] == 0){
                arr_1[i] = 1;
            }else{
                arr_1[i] = 0;
            }
        }

        int[] arr_2 = new int[8];
        arr_2[0] = 0;
        for (int i = 1; i < arr_2.length; i++) {
            arr_2[i] = i*3;

        }

        int[] arr_3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr_3.length; i++) {
            if (arr_3[i]<6){
                arr_3[i] = arr_3[i] *2;
            }
        }

        int arr_4L = 10;
        int[][] arr_4 = arrayFilling2(arr_4L);
        for (int i = 0; i < arr_4.length; i++) {
            arr_4[i][i] = 1;
            arr_4[i][arr_4[i].length-i-1] = 1;
        }

        int arr_5L = 20;
        int[] arr_5 = arrayFilling1(arr_5L);
        int max;
        int min;
        max = arr_5[0];
        min = arr_5[0];
        for (int i = 1; i < arr_5.length; i++) {
            if (arr_5[i]>max){
                max = arr_5[i];
            }
            if (arr_5[i]<min){
                min = arr_5[i];
            }
        }
    }

    public static boolean summa(int[] arr){
        int sum = 0;
        int value = arr[0];
        int k = 1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        if (sum%2 != 0){
            return false;
        }else {
            while (value < sum / 2) {
                value = value + arr[k];
                k++;
            }

        }
        if (value == sum/2){
            return true;
        }else{
            return false;
        }
    }

    public static int[] shift(int[] arr, int n){
        if (n<0){
            n= arr.length+n;
        }
        for (int i = 0; i < n; i++) {
            int k=arr[arr.length-1];
            int t;
            for (int j = 0; j < arr.length; j++) {
                t = arr[j];
                arr[j]=k;
                k=t;
            }

        }
        return arr;
    }

    public static int[][] arrayFilling2(int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        return arr;
    }
    public static int[] arrayFilling1(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*10);
            }

        return arr;
    }
}
