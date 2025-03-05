class power_of_2 {
    static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;


       return (n % 2 == 0) && isPowerOfTwo(n / 2);
        
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }
}