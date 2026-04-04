//Reverse an array in place
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,4,34,45,676,545};
        for(int i = 0 ; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Reversed array = ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }

    }
}