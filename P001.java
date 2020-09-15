public class P001 {

    public static void main(String[] args) {
        System.out.println(p001());
    }

    public static long p001() {
        long sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
