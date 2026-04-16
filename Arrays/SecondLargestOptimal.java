//Better solution
class SecondLargestOptimal {
    int sLargest(int a [], int n){
        int largest = a[0];
        int slargest = -1;
        for (int i = 1 ; i < n ; i++){
            if(a[i]>largest){
                slargest= largest;
                largest=a[i];
            }
            else if (a[i]< largest && a[i]>slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }
    int sSmallest(int a[] , int n){
        int smallest = a[0];
        int sSmallest = 1000000;
        for (int i = 1 ; i < n ; i++){
            if(a[i]<smallest){
                sSmallest= smallest;
                smallest=a[i];
            }
            else if (a[i]!=smallest && a[i]<sSmallest){
                sSmallest = a[i];
            }
            
        }
        return sSmallest;        
    }
    public static void main(String[] args) {
        int a[]={2,1224,34,533,3244,331};
        SecondLargestOptimal obj = new SecondLargestOptimal();
        obj.sSmallest(a, a.length);
        System.out.println("Largest element = "+obj.sLargest(a, a.length));
        System.out.println("Smallest element = "+obj.sSmallest(a, a.length));
    }
}
