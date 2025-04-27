class Solution {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int maxLen = 0, preSum = 0;
        mp.put(0, -1);
        
        for(int i=0; i<arr.length; i++) {
            preSum += arr[i];
            
            if(mp.containsKey(preSum)) {
                maxLen = Math.max(maxLen, i-mp.get(preSum));
            } else {
                mp.put(preSum, i);
            }
        }
        
        return maxLen;
    }
}