import java.util.*;
class sort0s1s_with_Swapping {
    public static void swap0_1(int arr[]){
        int l=arr.length;
        int left=0;
        int right=l-1;
        while(left<=right){
            if(arr[left]==1 && arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }for(int i =0;i<l;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String[]args){
        int []arr={1,1,0,0,0,1,1,1,0};
        swap0_1(arr);


    }
}
