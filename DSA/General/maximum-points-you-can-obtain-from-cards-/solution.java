class Solution {
    public int maxScore(int[] cardScore, int k) {
        int lSum=0;
        int rSum=0;
        int MaxSum=0;
        for(int i=0;i<k;i++){
            lSum+=cardScore[i];
            MaxSum=Math.max(lSum,MaxSum);
        }
        int right=cardScore.length-1;
        for(int i=k-1;i>=0;i--){
            lSum-=cardScore[i];
            rSum+=cardScore[right];
            MaxSum=Math.max(MaxSum,lSum+rSum);
            right--;
        }
        return MaxSum;
    
    }
}