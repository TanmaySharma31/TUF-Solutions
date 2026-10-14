class Solution {
    public int NthRoot(int N, int M) {
        long left=1;
        long right=M;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(Math.pow(mid,N)==M){
                return (int)mid;
            }else if(Math.pow(mid,N)<M){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
        
    }
}
