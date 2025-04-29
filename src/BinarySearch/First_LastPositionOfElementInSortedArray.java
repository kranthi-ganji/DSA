package BinarySearch;

public class First_LastPositionOfElementInSortedArray {
	public static int firstPosition(int[] arr,int target){
        int n = arr.length;
        int ans = -1;
        int low = 0,high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
	public static int lastPosition(int[] arr,int target){
        int n = arr.length;
        int ans = -1;
        int low = 0,high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};//answer {3,4}
		int target = 8;
		int a = firstPosition(nums,target);
        int b = lastPosition(nums,target);
        System.out.println(a+","+b);

	}

}
