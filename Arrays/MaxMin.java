//Find the maximum and minimum element in an array
class MaxMin{
    public static void main(String[] args) {
        int arr[]={1,4,34,45,676,545};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("Max : "+max+" Min : "+min);
    }
}