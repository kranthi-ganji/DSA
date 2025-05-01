package arrays;

public class checkArrayisSortedAndRoated {
	public static boolean helper(int[] nums) {
		//check how many times the current element is greater than next number 
		//if its <= 1 its sorted else unsorted
		int n = nums.length;
		int count = 0;
		for(int i = 0; i < n;i++) {
			if(nums[i] > nums[(i+1)%n]) count++;
		}
		return count <= 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5,1,2};
		int[] array1 = {3,4,5,1,4};
		
		System.out.println(helper(array));

	}

}
