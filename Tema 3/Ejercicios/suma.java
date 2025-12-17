public class suma {
    public static void main(String[] args) {
        int[] arrayInt = { 1, 2, 3, 4, 5 };
        System.out.println(sumaArray(arrayInt, arrayInt.length - 1));
    }

    static int sumaArray(int[] arr, int n) {
        if (n == 0)
            return arr[0];
        else
            return sumaArray(arr, n - 1) + arr[n];
    }
}
