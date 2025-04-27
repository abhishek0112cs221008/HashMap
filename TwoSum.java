class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = {-1};

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0; i<n; i++) {
            int want = target - nums[i];
            if(!mpp.containsKey(want)) {
                mpp.put(nums[i], i);
            }
            else {
                int j = mpp.get(want);
                ans = new int[]{i,j};
                return ans;
            }
        }

        return ans;
    }
}


// use another apporach 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = {-1};

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[j] == target - nums[i]) {
                    ans = new int[]{i,j};
                    return ans;
                }
            }
        }
        return ans;
    }
}