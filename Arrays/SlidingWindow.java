class SlidingWindow{
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2};
        int k=3;
        int windoSum=0;
        for(int i=0;i<k;i++){
            windoSum+=arr[i];
        }
        int maxSum=windoSum;
        for(int i=k;i<arr.length;i++){
            windoSum=windoSum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum, windoSum);

        }
        System.out.println(maxSum);
    }
}