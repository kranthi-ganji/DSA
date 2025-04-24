package arrays;

import java.util.*;

public class TwoSum {
	public static void twoSum(int[] nums, int target) {
        //Optimal  TC :O(n) SC :O(n)
        int n = nums.length;
        int[] answer = new int[2];
        answer[0] = -1;
        answer[1] = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
            	answer[0] = i;
                answer[1] = map.get(rem);
                System.out.print(answer[1]+" ");
                System.out.println(answer[0]);
            }
            map.put(nums[i], i);
        }
        return ; // no solution found
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,11,15,7};
		int target = 9;
		twoSum(nums,target);
		
	}

}
