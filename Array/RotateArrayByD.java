//Link:https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0 
/*
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 
Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int a[];
    static void reverse(int l, int r) {
        int temp;
        while(l<r){
            temp = a[l];
            a[l]= a[r];
            a[r]= temp;
            l++; r--;
        }
    }
    
    static void rotateByD(int n, int d) {
        reverse(0,d-1);
        reverse(d,n-1);
        reverse(0,n-1);
    }
  
  /*
  O(n^2) solution
  static void rotateByOne(int n) {
        int temp = a[0];
        int i=0;
        while(i<n-1) {
            a[i]=a[i+1];
            i++;
        }
        a[i]= temp;
    }
    
    static void rotateByD(int n, int d) {
        for(int i=0;i<d;i++)
           rotateByOne(n);
    }*/
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int d = sc.nextInt();
		    a = new int[n];
		    for(int i=0; i<n; i++) {
		        a[i] = sc.nextInt();
		    }
		    rotateByD(n,d);
		    for(int i=0;i<n;i++) {
		        System.out.print(a[i]+ " ");
		    }
		    System.out.println();
		}
	}
}
