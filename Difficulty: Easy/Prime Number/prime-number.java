class Solution {
    static boolean isPrime(int n) {
        // code here
       boolean isPrime=true;
       if(n<0||n==1){
           isPrime=false;
       }
       if(n>0){
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
               isPrime=false;
               break;
            }
           
        }
           
       }
         return isPrime;
        
    }
}