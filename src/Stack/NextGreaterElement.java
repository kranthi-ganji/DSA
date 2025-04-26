package Stack;

import java.util.*;

public class NextGreaterElement {
	public static void printArray(int[] array) {
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void helperBruteForce(int[] arr) {  // TC :- O(n2) SC :- O(1) 
		int n = arr.length;
		int[] answer = new int[n];
		for(int i = 0;i < n;i++) {
			answer[i] = -1;//default if no element found
			for(int j = i+1;j < n;j++) {
				if(arr[j] > arr[i]) {
					answer[i] = arr[j];
					break;
				}
			}
			
		}
		printArray(answer);
		
	}
	public static void optimal(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] answer = new int[n];
		for(int i = n-1;i>=0;i--) {
			if(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			answer[i] = st.isEmpty() ? -1 : st.peek();
			st.push(arr[i]);
			
		}
		printArray(answer);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 5, 2, 10, 20}; // answer {5, 10, 10, 20, -1}
		optimal(nums);

	}

}
