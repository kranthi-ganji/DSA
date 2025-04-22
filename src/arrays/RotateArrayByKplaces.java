package arrays;

public class RotateArrayByKplaces {
	public static void reverse(int[] nums,int start,int end) {
		while(start < end) {
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start++;
			end--;
		}
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7};
		int[] array1 = {3,4,5,6,7,8,9};
		printArray(array);
		System.out.println();
		int n = array.length;
		int k = 3;
		//for Right Rotation
		reverse(array,0,n-1);
		reverse(array,0,k-1);
		reverse(array,k,n-1);
		System.out.println("Right Rotation");
		printArray(array);
		System.out.println();
		printArray(array1);
		System.out.println();
		
		//for left Rotation
		reverse(array1, 0, k - 1);
		reverse(array1, k, n - 1);
		reverse(array1, 0, n - 1);
		System.out.println("Left Rotation");
		printArray(array1);
		
		
	}

}
