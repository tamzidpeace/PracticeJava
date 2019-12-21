package BJET;

public class sumOFArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int len = a.length;

        System.out.println(findSum(a, len));
    }

    static int findSum(int[] a, int len) {

        if (len == 0)
            return 0;
        return findSum(a, len - 1) + a[len - 1];
    }


}
