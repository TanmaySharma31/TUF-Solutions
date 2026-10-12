class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==k) return true;
            else if(nums[left]<=nums[mid]){
                if(nums[left]==nums[mid]&&nums[mid]==nums[right]){
                    while(left<n&&nums[left]==nums[mid] ){
                        left++;
                    }
                }else{
                    if(nums[left]<=k && k<nums[mid]){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }
            }else{
                if(k>nums[mid]&&k<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return false;
      
    }
}