class SecondLargest {
    public static void main(String[] args) {
         int arr[]={2,1224,34,533,3244,331};
        int largest = arr[0];
        int secondlargest = -1;
        for (int i = 0 ; i <arr.length;i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
         for (int i = 0 ; i <arr.length;i++){
            if(arr[i]!=largest && arr[i]>secondlargest)
                secondlargest = arr[i];
        }
        System.out.println("Largest element = "+secondlargest);
    }
}
