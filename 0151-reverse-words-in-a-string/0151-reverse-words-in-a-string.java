class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=" "+s;
        s=s+" ";
        int lastspace=s.length()-1;
        int n=s.length();
        String res="";
        for(int i=n-2;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
                for(int j=i+1;j<lastspace;j++){
                    res+=s.charAt(j);
                    if(j==lastspace-1 && i!=0){
                        res+=" ";
                    }
                    
                }
                lastspace=i;
            }
        }
        return res;
    }
}