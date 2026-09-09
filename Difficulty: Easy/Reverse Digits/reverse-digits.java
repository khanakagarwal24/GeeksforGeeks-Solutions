class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        int no=0;
        while(n>0){
           no=n%10;
           rev=rev*10+no;
           n/=10;
            
        }
        return rev;
    }
}