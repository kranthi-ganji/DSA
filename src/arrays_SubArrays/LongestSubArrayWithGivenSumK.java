package arrays_SubArrays;

import java.util.*;

public class LongestSubArrayWithGivenSumK {
	public static int helperBruteForce(int[] arr,int k) {
		int n = arr.length;
		int length = 0;
		for(int i = 0; i < n ;i++) {
			int sum = 0;
			for(int j = i;j < n;j++) {
				sum += arr[j];
				if(sum == k) {
					length = Math.max(sum, j - i+1);
				}
			}
		}
		return length;
		
		// TC :- O(n2)
	}
	
	// If we only positives numbers in the array then we can use the two pointers and sliding window
	public static int helperTwoPointers(int[] arr,int k) {
		int n = arr.length;
		int length = 0;
		int left = 0, right = 0;
		int sum = 0;
		while(right < n) {
			sum += arr[right];
			while(sum > k) {
				sum -= arr[left];
				left++;
			}
			if(sum == k) {
				length = Math.max(sum, right - left+1);
			}
			right++;
		}
		return length;
		
		// TC :- O(n)
	}
	//Optimal when we have both positives and negatives prefix sum + hashmap
	public static int helperOptimal(int[] arr,int k) {
		int n = arr.length;
		int length = 0;
		Map<Long,Integer> prefixMap = new HashMap<>();
		long sum = 0;
		for(int i = 0; i < n;i++) {
			sum += arr[i];
			if(sum == k){
				length = Math.max(length,i+1);  
	            }
			long rem = sum - k;
			if(prefixMap.containsKey(rem)) {
				int len = i - prefixMap.get(rem);
				length = Math.max(length, len);
			}
			// check if the sum is already present in the map because we need the longest subarray length
            //[2,0,0,3]
			if(!prefixMap.containsKey(sum)) {
				prefixMap.put(sum, i);
			}
		}
		return length;
		
		// TC :- O(n) SC :-O(n)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,0,0,3}; // answer = 3
		int k = 2;
		//System.out.println(helperBruteForce(array,k));
		//System.out.println(helperTwoPointers(array,k));
		int[] array1 = {10, 5, 2, 7, 1, -10}; // answer = 6
		int k1 = 15;
		System.out.println(helperOptimal(array1,k1));
	}

}
