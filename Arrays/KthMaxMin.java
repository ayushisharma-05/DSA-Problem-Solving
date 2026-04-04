//Find the 'Kth' max and min element of an array
import java.util.Arrays;
public class KthMaxMin {
    public static void main(String[] args) {
        int arr[]={100,4,343,45,676,545};
        int k = 3;
        Arrays.sort(arr);
        int max = arr[arr.length-k];
        int min = arr[k-1];

        System.out.println("kth Max : "+max+"  kth Min : "+min);
    }
}
