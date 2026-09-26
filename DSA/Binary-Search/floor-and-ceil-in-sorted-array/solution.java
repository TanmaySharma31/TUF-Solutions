class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        boolean floorfound=false;
        boolean cielfound=false;
        int floor=0;
        int ciel=0;
        int start=0;
        int end=nums.length-1;
        //Finding floor
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=x){
                floor=mid;
                floorfound=true;
                start=mid+1;
            }else if(nums[mid]<x){
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        start=0;
        end=nums.length-1;
        //Finding ciel
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=x){
                ciel=mid;
                cielfound=true;
                end=mid-1;
            }else if(nums[mid]<x){
                start=mid+1;

            }else{
                end=mid-1;
            }

       }
       if(floorfound){
        ans[0]=nums[floor];
       }
       if(cielfound){
        ans[1]=nums[ciel];
       }
       return ans;
       
    }
}