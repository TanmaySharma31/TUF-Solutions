class Solution {
    public int minimumRateToEatBananas(int[] arr, int h) {
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(num,max);
        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            long sum=0;
            for(int nums:arr){
                sum+= (nums+(long)mid-1)/mid;
            }
            if(sum<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
   
    }
}