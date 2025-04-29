package BinarySearch;

public class UpperBound {
	public static int upperBound(int[] arr,int target) {
		int n = arr.length;
        int ans = n ;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Upper Bound = Smallest index where array[index] > target
		int[] arr = {2, 3, 7, 10, 11, 11, 25};
		int target = 10;// answer 3
		System.out.println(upperBound(arr,target));

	}

}
