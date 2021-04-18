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

}
