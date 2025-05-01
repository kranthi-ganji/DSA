package BinarySearch;

public class SearchInARoatedSortedArray2 {
	public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1;
        while(left <= right){
            int mid = left + ( right - left)/2;
            if(nums[mid] == target) return true;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }
            //check for the sorted part
            else if(nums[left] <= nums[mid]){ // left part is sorted
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
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,6,0,0,1,2};
		int target = 0;//answer = true
		System.out.println(search(nums,target));

	}

}
