package arrays;

public class SortColours {
	public static void swap(int[] array,int num1,int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
	public static void printArr(int[] nums) {
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //OPTIMAL DNF ( DUTCH NATIONAL FLAG ALGO)  TC :O(n) SC:-O(1)
		int[] nums = {2,0,2,1,1,0};
		printArr(nums);
		System.out.println();
        int n = nums.length;
        int low = 0,mid = 0,high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if (nums[mid] == 1) mid++;
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        
        printArr(nums);
	}

}
