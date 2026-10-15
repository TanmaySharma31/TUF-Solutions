
class Solution {
    public int roseGarden(int n, int[] nums, int k, int m) {
        if(n<(k*m)){
            return -1;
        }
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            int b_count=0;
            int count=0;
            for(int i:nums){
               
                if(i<=mid){
                    count++;
                    if(count==k){
                    b_count++;
                    count=0;

                }
                }
                
                else{
                    count=0;
                }
            }
            if(b_count>=m){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
     
    }
}


