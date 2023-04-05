public class Programa4 {
    static int getProd(int arr[], int n)
    {
        int res = 1;
        for (int i = 0; i < n; i++)
            res = res * arr[i];
        return res;
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        int num1 = getProd(arr, n);
        int n2 = 7;
        int num2 = fib(n2);
    }
}
