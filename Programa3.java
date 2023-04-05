public class Programa3 {
    static int isPrime(int n, int i)
    {

        if (n == 2) 
            return 1;
        if (n < 2)
            return 0;
        if (n % i == 0)
            return 0;
        if (i * i > n)
            return 1;
        return isPrime(n, i + 1);
    }

    static int getSum(int arr[], int n)
    {
        int res = 0;
        for (int i = 0; i < n; i++)
            res = res + arr[i];
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        int num1 = getSum(arr, n);
        int n2 = 15;
        int i2 = 2;
        int num2 = isPrime(n2, i2);
    }
}
