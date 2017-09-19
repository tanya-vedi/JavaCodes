/*
 Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character dropped(including space and consider upper and lowercase as same).
 */
package javaapplication2;

/**
 *
 * @author vedi
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class alternateCharacters {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		String str;
		str=sc.nextLine();
		int n,i,m;
		char ch,ch1;
		while(t>0)
		{ t--;
		    str=sc.nextLine();i=0;
		    HashMap<Character,Integer> mp= new HashMap<Character,Integer>();
		    n=str.length();
		    while(i<n)
		    {  
		        ch=str.charAt(i);i++;
		        ch1=Character.toLowerCase(ch);
		        if(mp.containsKey(ch1))
		        {
		            m=mp.get(ch1);
		            if(m%2==0)
		              System.out.print(ch);
		            m++;
		            mp.put(ch1,m);
		        }
		        else
		        {
		            mp.put(ch1,1);
		            System.out.print(ch);
		        }
		    }
		    System.out.println();
		}
	}
}