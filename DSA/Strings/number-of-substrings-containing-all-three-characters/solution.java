class Solution {    
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int left = 0;
        int count = 0;

        int[] hash = new int[3];

        for (int right = 0; right < n; right++) {

            hash[s.charAt(right) - 'a']++;

            while (hash[0] > 0 && hash[1] > 0 && hash[2] > 0) {

                count += (n - right);

                hash[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}