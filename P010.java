public class P010 {

    public static void main(String[] args) {
        System.out.println(primeSum(2000000));
    }


    public static long primeSum(long n) {
        long sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    static boolean isPrime(int n) {
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
