package BinarySearch;

public class SearchInsertPosition {
	public static int helperBruteForce(int[] nums,int target) {
		int n = nums.length;
		if(target <= nums[0]) return 0;
		if(nums[n-1] < target) return n;
		for(int i = 0;i < n -1;i++) {
			if(target > nums[i] && target <= nums[i+1]) return i+1;
		}
		return -1;
	}
	//optimal binary Search
	public static int BS(int[] nums,int target) {
		int n = nums.length;
		if(target <= nums[0]) return 0;
		if(nums[n-1] < target) return n;
		int left = 0,right = n-1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] < target) left = mid+1;
			else right = mid -1;
		}
		return left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,6};
		int target = 7;// answer = 2
		System.out.println(BS(arr,target));

	}

}
