package arrays;

public class MovingZerosToEnd {
	public static void helperBruteForce(int[] nums) {
		int n = nums.length;
		int[] temp = new int[n];
		int idx = 0;
		for(int i = 0; i< n;i++ ) {
			if(nums[i] != 0) {
				temp[idx++] = nums[i];
			}
		}
		for(int i = idx;i < n;i++) {
			temp[i] = 0;
		}
		for(int i = 0 ;i < n;i++) {
			nums[i] = temp[i];
		}
		printArr(nums);
	}
	public static void printArr(int[] nums) {
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
	}
	
	public static void optimal(int[] nums) {
		int nonZeroIndex = 0;
		int n = nums.length;
		for(int i = 0;i < n;i++) {
			if(nums[i] != 0) {
				int temp = nums[nonZeroIndex];
	            nums[nonZeroIndex] = nums[i];
	            nums[i] = temp;
	            nonZeroIndex++;
			}
			
		}
		printArr(nums);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,7,0,0,4,0,2,8,9};
		helperBruteForce(arr);
		optimal(arr);
	}

}
