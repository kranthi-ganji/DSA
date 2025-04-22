package arrays;

public class RemoveDuplicatesFromSortedArray {
	public static int helper(int[] nums) {
		int n = nums.length;
		int i = 0;
		for(int j = 1; j < n;j++) {
			if(nums[i] != nums[j]) {
				nums[i+1] = nums[j];
				i++;
			}
			
		}
		for(int j = i+1;j < n;j++) {
			nums[j] = 0;
		}
		return i+1;
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,0,1,1,1,2,2,3,3,4};
		printArray(array);
		System.out.println();
		int ans = helper(array);
		System.out.println(ans);
		printArray(array);
	}

}
