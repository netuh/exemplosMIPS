public class Programa1{

    static int getMax(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            if(arr[i] > res)
                res = arr[i];
        return res;
    }

    // Returns sum of first 
    // n natural numbers
    public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }

    public static void main(String[] args)
    {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = 5;
        int num1 = getMax(arr, n);
        int n2 = 5;
        int num2 = recurSum(n2);
    }
}