//Link: https://www.codingninjas.com/codestudio/problems/find-pair-sum-in-rotated-and-sorted-array_985350 and https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/

public class Solution {
    public static int findPivot(int[] arr, int l, int h){
      if(l>h)
          return -1;
      if(l==h)
          return l;
      int mid=(l+h)/2;
      if(mid<h && arr[mid+1]<arr[mid] )
          return mid+1;
      if(l<mid && arr[mid]<arr[mid-1])
          return mid;
      if(arr[l]<arr[mid])
          return findPivot(arr,mid+1,h);
      return findPivot(arr,l, mid-1);
  }
    public static boolean findPairSum(int[] arr, int target) {
      int n=arr.length;
      int pivot=findPivot(arr,0,n-1);
      int l,h;
      if(pivot==-1)
      {
          l=0;
          h=n-1;
      }
      else{
          l=pivot;
          h=(pivot-1+n)%n;
      }
      while(l!=h){
          if(arr[l]+arr[h]==target)
              return true;
          if(arr[l]+arr[h]<=target)
              l=(l+1)%n;
          else
              h=(h-1+n)%n;
      }
      return false;
    }
}
