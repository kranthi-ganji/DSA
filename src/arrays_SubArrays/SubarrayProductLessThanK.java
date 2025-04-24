package arrays_SubArrays;

public class SubarrayProductLessThanK {
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i < n;i++){
            for(int j = i+1 ; j < n;j++){
            	int product = 1;
                for(int temp = i;temp <= j;temp++) {
                	product *= nums[temp];
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,5,2,6};
		int k = 100;
		System.out.println(numSubarrayProductLessThanK(nums,k));
	}

}
