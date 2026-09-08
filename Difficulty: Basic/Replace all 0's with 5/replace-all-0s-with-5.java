class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0){
            return 5;
        }
        int no=0;
        int re=0;
        int place=1;
        while(n>0){
            no=n%10;
            if(no==0){
              no=5;
            }
            re=re+(no*place);
            place*=10;
            n/=10;
        }
    return re; 
    }
    
}