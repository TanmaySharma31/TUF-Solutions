class Solution {
    public int upperBound(int[] nums, int x) {
        int start=0;
        int end=nums.length-1;
        int answer=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>x){
                end=mid-1;

            }else if(nums[mid]<=x){
                start=mid+1;
                
            }else{
                end=mid-1;
            }

        }
        return start;

  
    }
}
