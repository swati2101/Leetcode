class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int res=0,max=0;
        int start=0,end=0;
        for(int i=0;i<n;i++){
            int odd=splitFromMid(s,i,i);
            int even=splitFromMid(s,i,i+1);
            int len=Math.max(even,odd);
            //max=Math.max(max,len);
            
            if(len>max){
                start=i-(len-1)/2;
                end=i+len/2;
                max=len;
            }
                
            
            
        }
        return s.substring(start,end+1);
        
    }
    int splitFromMid(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    
}