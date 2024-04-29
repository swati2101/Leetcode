class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();
        int left = 0, r = 0;
        int n = s.length();
        int len = 0;
        while(r<n){
            if(mpp.containsKey(s.charAt(r))){
                left=Math.max(left,mpp.get(s.charAt(r))+1);
            }
            mpp.put(s.charAt(r),r);
            len=Math.max(len,r-left+1);
            r++;
        }
        return len;
    }
}