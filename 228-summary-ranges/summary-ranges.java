class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int start = 0;
        int n = nums.length;

        for (int i = 1; i <= n; i++) {

            if (i == n || nums[i] != nums[i - 1] + 1) {

                if (start == i - 1) {
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[i - 1]);
                }

                start = i;
            }
        }

        return result;
    }
}