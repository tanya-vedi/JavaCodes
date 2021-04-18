//Link: https://leetcode.com/problems/search-in-rotated-sorted-array

class Solution {
    
    /* Alternatively: https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
        int search(int[] nums, int l, int r, int target) {
        if(l<=r) {
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            // l-> mid-1 is sorted 
            if(nums[l]<=nums[mid]) {
                if(nums[l]<=target && nums[mid]>=target)
                    return search(nums, l, mid-1, target); 
                else
                    return search(nums, mid+1, r, target);
            }
            if(nums[r]>=nums[mid]){
                if(nums[r]>=target && nums[mid]<=target)
                    return search(nums, mid+1, r, target);
            }
            return search(nums, l, mid-1, target); 
        }
        return -1;
    }
    */
    
    int findPivot(int[] nums, int l, int r) {
        if(l>=r) return -1;
        int mid = (l+r)/2;
        if(mid<r && nums[mid]>nums[mid+1]) return mid+1;
        if(mid>l && nums[mid]<nums[mid-1]) return mid;
        if(nums[l]>=nums[mid]) return findPivot(nums, l, mid-1);
        return findPivot(nums, mid+1, r);
    }
    
    int binarySearch(int[] nums, int l, int r, int target) {
        if(l<=r) {
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) return binarySearch(nums,l, mid-1, target);
            else return binarySearch(nums, mid+1, r, target);
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums, 0, n-1);
        if(pivot == -1) 
            return binarySearch(nums, 0, n-1, target);
        if(nums[pivot]==target)
            return pivot;
        if(nums[0]<=target) 
            return binarySearch(nums, 0, pivot-1, target );
        else 
            return binarySearch(nums, pivot+1, n-1, target);
    }
}
