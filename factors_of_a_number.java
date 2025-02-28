public class factors_of_a_number {
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {  
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        factors(120);  
    }
}

