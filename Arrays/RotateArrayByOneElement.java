class RotateArrayByOneElement {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4};
        int temp = arr[0];

        int i;
        for (i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[i - 1] = temp;

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
