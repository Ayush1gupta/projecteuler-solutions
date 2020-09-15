public class P006 {

    public static void main(String[] args) {
        long sum = sumOfNNumbers(100);

        System.out.println(sum*sum-sumOfNSquares(100));
    }

    public static long sumOfNNumbers(long n) {
        return (n*(n+1))/2;
    }
    public static long sumOfNSquares(long n) {
        return (n*(n+1)*((2*n)+1))/6;
    }
