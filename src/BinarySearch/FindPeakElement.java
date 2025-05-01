package BinarySearch;

public class FindPeakElement {
	public static int helperBruteForce(int[] nums) {
		int n = nums.length;
        if(n==1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        for(int i  = 1; i < n-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        return -1;
	}
	public static int hoptimalBS(int[] nums) {
	int n = nums.length;
    if(n==1) return 0;
    if(nums[0] > nums[1]) return 0;
    if(nums[n-1] > nums[n-2]) return n-1;
    int low = 1;
    int high = n-2;
    while(low <= high){
        int mid = low + (high-low)/2;
        if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
        if (nums[mid] > nums[mid -1]) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,1,3,5,6,4};//answer = 1 or 5
		System.out.println(hoptimalBS(array));
	}

}
