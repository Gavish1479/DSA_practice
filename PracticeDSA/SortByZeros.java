import java.util.ArrayList;
import java.util.List;

public class SortByZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,0,1,1};
        int j =0;
        for (int i = 0; i < arr.length; i++) {//i=3..
            if (arr[i]==0){//true
                int swap = arr[i];//arr[3]==1..swap=1...
                arr[i] = arr[j];//arr[3]=0..arr[1]..arr[0,0,1,1]
                arr[j]=swap;//arr[0]=1
                j++;//j=1..
            }
        }
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
