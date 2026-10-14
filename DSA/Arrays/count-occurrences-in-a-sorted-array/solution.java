class Solution {
    public int countOccurrences(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int first=-1;
        int last=-1;
        // First Occurence
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;

            }else{
                right=mid-1;
            }
        }
        if(first==-1){
            return 0;
        }
        // Last Occurence
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return last-first+1;
        

    }
}
