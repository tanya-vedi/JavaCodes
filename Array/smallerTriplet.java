/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author vedi
 */
public class smallerTriplet {
    public static void main(String args[])
    {int n,x,i,count,j,k;
     Scanner sc= new Scanner(System.in);
     n=sc.nextInt();
     int arr[]=new int[n];
     for(i=0;i<n;i++)
         arr[i]=sc.nextInt();
     Arrays.sort(arr);
     x=sc.nextInt();
     count=0;

     for(i=0;i<n-2;i++)
     { 
       j=i+1;k=n-1;
       while(j<k)
       { if(arr[i]+arr[j]+arr[k]>=x)
           k--;
          else
       { count+=(k-j);
         j++;
       } 
       }
     }
     System.out.println(count);
    }
}