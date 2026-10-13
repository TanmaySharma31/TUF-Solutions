class Solution {
    public int findMin(ArrayList<Integer> arr) {
        int left=0;
        int right=arr.size()-1;
        int min=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr.get(mid)<min){
                min=arr.get(mid);

            }else if(arr.get(right)<=arr.get(mid)){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return min;
      
    }
}
