/*
 * In a native language the increasing order of priority of characters is a, b, c, d, e, f, g, h, i, j, k, l, m, n, ’ng’ , o, p, q, r, s, t, u, v, w, x, y, z. You are given two strings string1 and string2 and your task is to compare them on the basis of the given priority order.

*Print ‘0’ if both the strings are equal, ‘1’ if string1 is greater than string2 and ‘-1’ if string1 is lesser than string2. All the strings consist of lowercase English alphabets only.
 */
package javaapplication2;

/**
 *
 * @author vedi
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class StringComparison {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(compare(s1, s2));
		}
	}
	
	public static int compare(String s1, String s2) {
	int n = s1.length(), m = s2.length(), i = 0, j = 0;
	    while (i < n && j < m)
	    {
	    	if ((s1.charAt(i) == 'n' && i < n-1 && s1.charAt(i+1) == 'g') &&  (s2.charAt(j) == 'n' && j < m-1 && s2.charAt(j+1) == 'g'))
        	{
        		i++;
        		j++;
        		continue;
        	}
	    	
	    	if (i < n-1 && s1.substring(i, i+2).equals("ng"))
	    	{
	    		if (s2.charAt(j) >= 'o')
	    			return -1;
	    		else
	    			return 1;
	    	}
	    	if (j < m-1 && s2.substring(j, j+2).equals("ng"))
	    	{
	    		if (s1.charAt(i) >= 'o')
	    			return 1;
	    		else
	    			return -1;
	    	}
	        if (s1.charAt(i) != s2.charAt(j))
	        {
                if (s1.charAt(i) < s2.charAt(j))
                    return -1;
                else
                    return 1;
	        }
	        i++;
	        j++;
	    }
	    if (i < n)
	        return 1;
	    if (j < m)
	        return -1;
	    return 0;
	}
}