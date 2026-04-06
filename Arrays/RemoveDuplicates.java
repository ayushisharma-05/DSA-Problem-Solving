class RemoveDuplicates {

    public static int removeDuplicates(int arr[]) {

        if (arr.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4};

        int newLength = removeDuplicates(arr);

        System.out.println("Unique elements:");

        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
