import java.util.*;

public class bubblesort_ {
public static void main(String[] args) {
    int [] arr={5,3,8,9,1,2,4};
    int i,size; 
    int temp=0;
    size =arr.length;  
     System.out.println("before sorting");
     System.out.println(Arrays.toString(arr));

    for(i=0;i<size;i++){
        for(int j=0;j<size-i-1;j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] =arr [j+1];
                arr[j+1]=temp;
            }
         }
    }
       
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));

}
    
}
