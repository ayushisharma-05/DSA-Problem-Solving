public class Sort012 {
    static void swap (int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,1,1,0,0,1,2,1};
        int low =0 ;
        int high = arr.length -1;
        int mid = 0 ;
        while(mid< high){
            if(arr[mid]== 0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,high,mid);
                high --;
            }
        }
        for(int m = 0 ; m < arr.length;m++) {
            System.out.print(arr[m] + " ");
        }
    }
}


