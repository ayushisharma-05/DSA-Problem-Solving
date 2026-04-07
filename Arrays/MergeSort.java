class MergeSort{
    public static void Merge(int arr[], int low , int mid , int high){
        int k = 0 ;
        int left = low;
        int right = mid+1;
        int temp[] = new int[high - low + 1];
        while(left<= mid && right <=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }
        while(left<= mid){
            temp[k++] = arr[left++];
        }
        while( right <=high){
            temp[k++] = arr[right++];
        }
    for(int i = 0; i < temp.length; i++){
        arr[low + i] = temp[i];
    }
 
    }
    public static void mergeSort(int arr[], int low, int high){
        if(low >= high) return ;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high);
        Merge(arr,low, mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {13,233,2,23,21,232,332,3233,32,3,89};
        mergeSort(arr,0,arr.length-1);
        for(int num : arr){
            System.err.println(num);
        }
    }
}