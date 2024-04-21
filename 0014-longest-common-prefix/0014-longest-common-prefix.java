class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String temp=strs[0];
        String ans="";
        for(int i=1;i<strs.length;i++){
            ans=solve(temp,strs[i]);
            temp=ans;
            
        }
        return ans;
        
    }
    public String solve(String a,String b){
        String temp="";
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                temp+=a.charAt(i);
                i++;
                j++;
            }
            else{ break;}
        }
        return temp;
    }
}