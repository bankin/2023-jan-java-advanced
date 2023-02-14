public class DemoMain {
    public static void main(String[] args) {
        System.out.println(pow(5, 1));

        System.out.println(pow(2, 5));

        System.out.println(fib(45));
    }

    private static int pow(int num, int power) {
        if (power == 1) { return num; }

        return num * pow(num, power - 1);
    }



    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, .....
    private static int fib(int n) {
        if (n == 1) { return 0; }
        if (n == 2) { return 1; }

        return fib(n - 1) + fib(n - 2);
    }

}