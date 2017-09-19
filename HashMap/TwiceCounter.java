
package javaapplication2;

/**
 *
 * @author vedi
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

class TwiceCounter {
	public static void main(String[] args)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            int check=0;
            int len=Integer.parseInt(br.readLine());
            HashMap<String,Integer> mp=new HashMap<String,Integer>();
            String str=new String(br.readLine());
            StringTokenizer st=new StringTokenizer(str," ");
            int count=st.countTokens();
            for(int i=0; i<count; i++)
            {
                String s=st.nextToken();
                if(mp.containsKey(s))
                {
                    int n=mp.get(s);
                    n++;
                    mp.put(s,n);
                }
                else
                {
                    mp.put(s,1);
                }
            }
            for (String key : mp.keySet()) 
            {
                int n=mp.get(key);
                if(n==2)
                    check++;
            }
            System.out.println(""+check);
            t--;
        }
    }
}
