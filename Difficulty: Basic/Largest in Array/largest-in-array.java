class Solution {
    public static int largest(int[] arr) {
        // code here
        int lar=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}
