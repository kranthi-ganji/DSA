package BinarySearch;

public class SearchInARoatedSortedArray1 {
	public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1;
        while(left <= right){
            int mid = left + ( right - left)/2;
            if(nums[mid] == target) return mid;
            //check for the sorted part
            if(nums[left] <= nums[mid]){ // left part is sorted
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{ // Right part is sorted
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;//answer = 4
		System.out.println(search(nums,target));

	}

}
