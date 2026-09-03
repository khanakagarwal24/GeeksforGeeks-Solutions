class Solution {
    public static int countDigits(int n) {
        // Code here
        int count=0;
        int digit=0;
        while(n>0){
            digit =n%10;
            count++;
            n/=10;
        }
        return count;
    }
}
