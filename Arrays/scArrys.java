import java.util.*;
class scArrys{
    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter the elements");
        int helo[]= new int [size];
        for(int i =0;i<size;i++){
            helo[i]= sc.nextInt();

        }
        int x = helo.length;
        for ( int i =0;i < helo.length;i++){
            

        }
        System.out.println(Arrays.toString(helo));
            System.out.println();
    }
}