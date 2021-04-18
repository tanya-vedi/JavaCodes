//sort an array in wave form :https://www.geeksforgeeks.org/sort-array-wave-form-2/ 
// Link : https://www.codingninjas.com/codestudio/problems/sort-an-array-in-wave-form_975285

import java.util.ArrayList;

public class Solution {
	static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    
	public static void waveFormArray(int[] arr, int n)
	{   
        for(int i = 0; i<n; i+=2) {
            if(i!=0 && arr[i]<arr[i-1])
                swap(arr, i, i-1);
            if(i!=(n-1) && arr[i]<arr[i+1])
                swap(arr, i, i+1);
        }
	}
	
	/*Alternatively :O(n^2)
	// This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    void sortInWave(int arr[], int n)
    {
        // Sort the input array
        Arrays.sort(arr);
  
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }*/

}
