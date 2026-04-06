//Better solution
class CheckSortedArray {
    public static void main(String[] args) {
        int[] a = {2, 34, 533, 1224, 3244};
        int n = a.length;

        if (isSorted(n, a)) {
            System.out.println("The array is sorted!");
        } else {
            System.out.println("The array is NOT sorted.");
        }
    }
    public static boolean isSorted(int n, int[] a) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}