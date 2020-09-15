public static void main(String[] args) {
        System.out.println(p005(20));
    }

    public static long gcf(long number1, long number2) {
        if(number1%number2 != 0)
            return gcf(number2,number1%number2);
        else
            return number2;
    }

    public static long p005(long n) {
        long lcm = 1;
        for (long i = 1; i <= n; i++)
            lcm = (lcm * i)/(gcf(lcm, i));
        return lcm;
    }
