public class twoaum {
        public boolean twosum(int[]arr,int target){
            for (int i=0;i<arr.length;i++){
                for(int j=arr.length-1;j>i;j--){
                    if(arr[i] +arr[j]==target)
                        return true;
                    
            }
                
    
            }
            false;
            public static void main(String[]args){
                int []a={5,2,3,9,7,4};
    
                System.out.println(twosum(a,9));
            }
        }
    }
    
}
