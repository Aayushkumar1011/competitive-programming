/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t = 1; t <= test; t++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int i = 1, res = 0;
		    while(i <= x){
		        res += y;
		        if(i%3 == 0 && i != x){
		            res += z;
		        }
				i++;
		    }
		    
		    System.out.println(res);
		    
		}
	}
}
