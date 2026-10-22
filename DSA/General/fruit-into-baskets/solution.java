class Solution {
    public int totalFruits(int[] fruits) {
        int left=0;
        int right=0;
        int max=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        while(right<fruits.length){
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0)+1);
            while(mpp.size()>2){
                mpp.put(fruits[left],mpp.get(fruits[left])-1);
                if(mpp.get(fruits[left])==0){
                    mpp.remove(fruits[left]);
                }
                left++;
            }
           
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}