import java.util.Arrays;                           // REVERSE ALL ELEMENTS
public class revarry {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int i = 0;
        int j=arr.length-1;
        while(i<=j){                            
            int temp = arr[i];                   // ___
            arr[i] = arr[j];                    //     |__   Swapping 
            arr[j] = temp;                     //   ___|
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
