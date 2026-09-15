class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] ans=new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                ans[0]+=1;
            }
            else{
                ans[1]+=1;
            }
        }
        return ans;
    }
}