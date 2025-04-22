package arrays;

public class SecondLargestNumber {
	public static int secondLargestNumber(int[] nums) {
		int largestElement = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;
		for(int num : nums ) {
			if(num > largestElement) {
				secondLargestNumber = largestElement;
				largestElement = num;
			}
			if( num > secondLargestNumber && num != largestElement) {
				secondLargestNumber = num;	
			}
		}
		if(secondLargestNumber == Integer.MIN_VALUE) return -1;
		return secondLargestNumber;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,7,2,8,3,8,};
		int[] array1 = {2,2,2,2,2};
		int answer = secondLargestNumber(array1);
		System.out.println(answer);
	}

}
