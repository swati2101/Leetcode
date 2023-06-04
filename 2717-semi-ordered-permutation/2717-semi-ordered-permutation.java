class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n=nums.length;
        if(nums[0]==1 && nums[n-1]==n)
            return 0;
        if(n==2){
            return 1;
        }
        int first=0,last=0;
        for(int i = 0; i < n; ++i){
            if(nums[i] == 1) first = i;
            if(nums[i] == n) last = i;
        }
        System.out.println(first+" "+last);
        //System.out.println()
        int count1=0;
        for(int i=first;i>=0;i--){
            if(i==0)
                break;
                count1++;
                int temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
            System.out.println(i);
        }
        /*while(first!=1){
            int temp=nums[first];
            nums[first]=nums[first-1];
            nums[first-1]=temp;
            first--;
            count1++;
        }*/
        for(int i = 0; i < n; ++i){
            //if(nums[i] == 1) first = i;
            if(nums[i] == n) last = i;
        }
        int count2=0;
        for(int i=last;i<n;i++){
            if(i==n-1)
                break;
            count2++;
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
            System.out.println(i);
        }
        /*while(last!=n-2){
            int temp=nums[last];
            nums[last]=nums[last+1];
            nums[last+1]=temp;
            last++;
            count2++;
        }*/
        //return count1+count2;
        /*int count=0;
        if(first<last)
            count=first+(n-1-last);
        if(first>last)
            count=first+(n-1-last)-1;*/
        return count1+count2;
    }
}