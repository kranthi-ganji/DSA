package arrays_SubArrays;
import java.util.*;
public class LargestSubarrWith0sum {
	public static int maxLen(int arr[]) {
        // code here
        int n = arr.length;
        int length = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            sum += arr[i];
            if(sum == 0){
                length = Math.max(length,i+1);
            }
            if(map.containsKey(sum)){
                length = Math.max(length,i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23}; // answer = 5 -->[-2, 2, -8, 1, 7].
		System.out.println(maxLen(arr));
	}

}
