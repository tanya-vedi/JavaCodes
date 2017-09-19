
package javaapplication2;

/**
 *
 * @author vedi
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class  UncommonCharacters {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s1=sc.next();//s1=s1.tolowerCase();
		    String s2=sc.next();
		    int a1[]=new int[26];int a2[]=new int[26];
		    for(int i=0;i<s1.length();i++)
		    {
		        a1[(int)s1.charAt(i)-97]++;
		    }
		    for(int i=0;i<s2.length();i++)
		    {
		        a2[(int)s2.charAt(i)-97]++;
		    }
		    for(int i=0;i<26;i++)
		    {
		        if((a1[i]==0 & a2[i]!=0)||(a1[i]!=0 & a2[i]==0))
		        System.out.print((char)(i+97));
		    }
		    System.out.println();
		}
	}
}
