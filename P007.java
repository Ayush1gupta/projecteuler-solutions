public class P007{

    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }


    public static long nthPrime(long n) {
        long i, count;
        long prime =2;
            for(i=2, count=1; count <=n; i++) {
                    if(isPrime(i)) {
                        count++;
                    }
            }
            return i-1;
    }

    private static boolean isPrime(long n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
