/* given an array with only numbers 0 and 1. There are two types of queries -

0 L R : Check whether the number formed from the array elements L to R is even or odd and print EVEN or ODD respectively. Number formation is the binary number from the bits status in the array L to R

1 X : Flip the Xth bit in the array 

Indexing is 1 based

Input
First line contains a number N and Q as input. Next line contains N space separated 0 or 1. Next Q lines contain description of each query 

Output
Output for only query type 0 L R whether the number in range L to R is "EVEN" or "ODD" (without quotes).
*/

import java.util.*;
class BinaryQueries {
    public static void main(String args[] ) throws Exception {
        int n,q,case1,l,r,x;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        q=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<q;i++)
        {
           case1=sc.nextInt();
           if(case1==0)
           {  l=sc.nextInt();
                       r=sc.nextInt();
                       if(arr[r-1]==1)
                       System.out.println("ODD");
                       else
                       System.out.println("EVEN");
               
           }
           else
           {
               x= sc.nextInt();
               x++;
                   if(arr[x]==0)
                      arr[x]=1;
                   else arr[x]=0;
           }
           
        }
        
    }
}
