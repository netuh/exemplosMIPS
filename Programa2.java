public class Programa2{
    static int getMin(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            if(arr[i] < res)
                res = arr[i];
        return res;
    }

    public static int recurProd(int n)
    {
        if (n <= 1)
            return n;
        return n * recurProd(n - 1);
    }


    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        int num1 = getMin(arr, n);
        int x = 5;
        int num2 = recurProd(x);
    }
}