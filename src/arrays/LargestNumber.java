package arrays;

public class LargestNumber {
	public static int largestNumber(int[] nums) {
		int largestElement = Integer.MIN_VALUE;
		for(int num : nums ) {
			if(num > largestElement) {
				largestElement = num;
			}
		}
		return largestElement;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,7,2,8,3,8,};
		int answer = largestNumber(array);
		System.out.println(answer);
	}

}
