class Solution {
    public double myPow(double x, int n) {
       if(n==0){
            return 1.0;
        }
        
        long nn=Math.abs((long)n);
        double ans=1.0;
        nn=Math.abs((long)n);
        while(nn>0){
            if((nn&1)==1){
                ans=ans*x;
                nn=nn-1;
                
            }
            else{
                x=x*x;
                nn=nn>>1;
            }
            
        }
        if(n<0){
            ans=1/ans;
            
        }
        
        return ans;
        /*double ans = 1;
        long absN = Math.abs((long)n);
        while(absN > 0) {
            if((absN&1)==1) ans *= x;
            absN >>= 1;
            x *= x;
        }
        return n < 0 ?  1/ans : ans;*/
    }
}