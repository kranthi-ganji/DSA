package BinarySearch;

public class MinimumInRoatedSortedArray {
	public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int answer = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + ( right - left)/2;
            //Sorted part may or may not have the minimum
            if(nums[left] <= nums[mid]){ // left is sorted
                answer = Math.min(answer,nums[left]);
                left = mid + 1;
            }
            else{
                answer = Math.min(answer,nums[mid]);
                right = mid - 1;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,5,1,2}; // answer = 1
		System.out.println(findMin(nums));

	}

}
