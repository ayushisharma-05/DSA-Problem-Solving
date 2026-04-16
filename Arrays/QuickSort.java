public class QuickSort {
    void qs(int arr[], int low , int high){
        if(low<high){
            int partition = f(arr, low , high);
            qs(arr, low,partition -1 );
            qs(arr, partition +1,high );
        }
    }
    int f(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot&& i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       int temp = arr[low];
       arr[low] = arr[j];
       arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int arr[]= {12,45,3,8,66,13,100,6,23};
        QuickSort obj = new QuickSort();
        obj.qs(arr,0,8);
        System.out.print("Sorted array: ");

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
}
