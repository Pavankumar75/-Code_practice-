public class thirdlargest_in_array {
    static int thirdlargest(int []arr){
        int largest=0;
        int second_largest=0;
        int third_largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest && arr[i]>second_largest){
                second_largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<second_largest && arr[i]>third_largest){
                third_largest=arr[i];
            }
        }
        return third_largest;

    }
    public static void main(String[]args){
        int []arr={5,6,9,8,7,4,2,3,10};
        System.out.println(thirdlargest(arr));

    }
}
