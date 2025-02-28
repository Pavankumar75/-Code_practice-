public class happy_number {
    static int happy(long n){
        int sum=0;
        while(n>0){
          long temp=n%10;
            sum +=temp*temp;
            n/=10;

        }
        
        return sum;



    }
    public static void main(String[] args) {
        System.out.println(happy(564465654));
    }

}
