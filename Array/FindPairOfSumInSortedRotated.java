//Link: https://www.codingninjas.com/codestudio/problems/find-pair-sum-in-rotated-and-sorted-array_985350 and https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/

public class Solution {
    // find the smallest one 
    static int findPivot(int nums[], int l, int r) {
        if(l>=r) return -1;
        int mid = (l+r)/2;
        if(mid<r && nums[mid]>nums[mid+1]) return mid+1;
        if(mid>l && nums[mid]<nums[mid-1]) return mid;
        if(nums[l]>=nums[mid]) return findPivot(nums, l, mid-1);
        return findPivot(nums, mid+1, r);
    }
    
	public static boolean findPairSum(int[] arr, int target) {
        int n = arr.length;
		int pivot = findPivot(arr, 0, n-1);
        int l, r; 
        if(pivot == -1){
            l = 0; r = n-1; 
        } //pivot is smallest 
        else {
            l = pivot;
            r = (n+pivot-1)%n;
        }
        while(l!=r) {
            if((arr[l]+arr[r])==target) return true;
            if(arr[l]+arr[r]<target) 
                l = (l+1)%n;
            else
                r = (r+n-1)%n;
        }
        return false; 
	}
}

