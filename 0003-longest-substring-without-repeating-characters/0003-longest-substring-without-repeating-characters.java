class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int max=0;
        HashSet<Character> hs=new HashSet<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(hs.contains(ch))
            {
            
                //hs.remove(ch);
                while(l<r && hs.contains(ch)){
                    hs.remove(s.charAt(l));
                    l++;
                }
                
            }
            hs.add(ch);
            max=Math.max(max,r-l+1);
            r++;
            
        }
        return max;
        
    }
}