/*A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….*/
import java.io.*;
import java.util.*;

public class MagicNumber {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n,remainder,sum,pow;
        n=sc.nextInt();
        sum=0;pow=1;
        while(n!=0)
        {   
            pow*=5;
            remainder=n%2;
            if(remainder==1)
            sum+=pow;
            n/=2;
        }
        System.out.println(sum);
    }
}
