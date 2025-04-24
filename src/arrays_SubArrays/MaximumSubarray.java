package arrays_SubArrays;

public class MaximumSubarray { //Kadane’s Problem

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; // answer = 6
		int length=nums.length;
        if(length==1) {
        	System.out.println(nums[0]);
        }

        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i = 0 ; i < length;i++){
            current_sum += nums[i];
            max_sum = Math.max(max_sum,current_sum);
            if(current_sum < 0) current_sum = 0;
        }
        System.out.println(max_sum);
	}

}
