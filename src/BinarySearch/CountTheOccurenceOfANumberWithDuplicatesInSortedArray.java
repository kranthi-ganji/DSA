package BinarySearch;

public class CountTheOccurenceOfANumberWithDuplicatesInSortedArray {
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
    }public static int lastPosition(int[] arr,int target){
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
		int[] arr = {1, 1, 2, 2, 2, 2, 3};
		int target = 2;//answer = 4
		int a = firstPosition(arr,target);
        if(a == -1) System.out.println(0);
        int b = lastPosition(arr,target);
        System.out.println(b-a+1);

	}

}
