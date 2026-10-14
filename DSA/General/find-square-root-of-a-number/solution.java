class Solution {
    public int floorSqrt(int n) {
        long left=1;
        long right=n;
        long ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            if((mid*mid)>n){
                right=mid-1;
            }else{
                ans=mid;
                left=mid+1;
            }
        }
        return (int)ans;
      
    }
}