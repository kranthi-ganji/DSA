package arrays;

import java.util.*;

public class UnionOfTwoSortedArrays {
	public static void helperBruteForce(int[] nums1, int[] nums2) {
		// TC :-O(n1) + O(n2) + O(n1+n2) SC :- O(n)
		Set<Integer> set = new HashSet<>();
		int n1 = nums1.length;
		int n2 = nums2.length;
		for (int i = 0; i < n1; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < n2; i++) {
			set.add(nums2[i]);
		}
		int[] unionArr = new int[set.size()];
		int idx = 0;
		for (int num : set) {
			unionArr[idx++] = num;
		}

		for (int num : unionArr) {
			System.out.print(num + " ");
		}

	}

	public static void optimal(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		List<Integer> list = new ArrayList<>();
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (nums1[i] < nums2[j]) {
				if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
					list.add(nums1[i]);
				}
				i++;
			} else {
				if (list.size() == 0 || list.get(list.size() - 1) != nums2[j]) {
					list.add(nums2[j]);
				}
				j++;
			}
		}
		while (i < n1) {
			if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
				list.add(nums1[i]);
			}
			i++;
		}
		while (j < n2) {
			if (list.size() == 0 || list.get(list.size() - 1) != nums2[j]) {
				list.add(nums2[j]);
			}
			j++;
		}
		System.out.println("Optimal approach");
		for(int num : list) {
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 7 };

		//helperBruteForce(array1, array2);
		
		optimal(array1, array2);

	}
}
