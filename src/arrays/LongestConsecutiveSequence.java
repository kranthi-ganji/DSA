package arrays;
import java.util.*;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] nums) {
        //Optimal TC :- O(n) Sc :- O(n)
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int longest = 0;
        
        for(int num : set){
            if(!set.contains(num-1)){ // start of the sequence
                int currNum = num;
                int count = 1;
                while(set.contains(currNum + 1)){
                currNum++;
                count++;
            }
                longest = Math.max(longest,count);
            }
        }
        return longest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,3,2}; // answer = 4
		System.out.println(longestConsecutive(nums));

	}

}
/*public  boolean linearSearch(int[] nums,int target){
for(int num : nums){
if(num == target) return true;

}
return false;
}
public int longestConsecutive(int[] nums) {
//Brutre Force TC -O(n2) SC:- O(1) For every num will check the next number is present or not
int n = nums.length;
if(n == 0) return 0;
int longest = 1;
for(int i = 0; i < n;i++){
int x = nums[i];
int count = 1;
while(linearSearch(nums,x+1)){
    x++;
    count++;
}
longest = Math.max(longest,count);
}
return longest;
}
*/