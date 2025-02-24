import java.util.*;
import java.util.Arrays;

public class minmax {
   public static void main(String[] args) {
    System.out.println("enter the size");
     Scanner sc = new Scanner(System.in);
     int size = sc .nextInt();
     int array[]=new int [size];
     for (int i = 0;i<size;i++){
        array  [i]= sc.nextInt();

     }
     int min = array[0];

     int max= array[0];


     for(int i=1;i<array.length;i++){
         if(array[i]<min){
         min = array[i];
        }
         if(array[i]>max){
         max = array[i];
        }
     }
     System.out.println(Arrays.toString(array));
    System.out.println("max : " + max );
    System.out.println("min : " + min);

   } 
    
}
//__________________________________________________________________________________________________________________________________________________
/*import java.util.*;
import java.util.Arrays;

public class minmax {
   public static void main(String[] args) {
    System.out.println("find the min max of arrays");
    int [] array = {5,6,99,22,12,77,26};
    int min = array[0];
    int max = array[0];
    for (int i = 1;i<array.length;i++){
        if(array[i]<min){
            min=array[i];
        }
        if(array[i]>max){
            max=array[i];
        }
    }
    System.out.println("min :"+min);
    System.out.println("max :"+max);
   }
}*/
