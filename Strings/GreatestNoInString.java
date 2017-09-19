
package javaapplication2;

/**
 *
 * @author vedi
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GreatestNoInString {
	public static void main (String[] args) {
		//code
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    System.out.println(fun(sc.next()));
		}
	}
	static int fun(String st){
		int n=st.length();
		int num=0;int max=0;
		for(int i=0;i<n;i++){
			if(Character.isDigit(st.charAt(i))){
				num=num*10+st.charAt(i)-'0';
			}
			else{
				max=Math.max(max, num);
				num=0;
			}
		}
		return Math.max(max, num);
	}
}
