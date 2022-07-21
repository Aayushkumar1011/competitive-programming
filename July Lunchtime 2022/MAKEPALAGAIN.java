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
		    int n = sc.nextInt();
		    String s = sc.next();
		    char[] arr = s.toCharArray();
		    StringBuilder s1 = new StringBuilder();
		    StringBuilder s2 = new StringBuilder();
		    for(int i = 0; i <n; i++){
		        if(i%2 == 0)
		            s2.append(arr[i]);
		        else
		            s1.append(arr[i]);
		    }
		    boolean isPalindrome = isPalindrome(arr, n);
		    char[] arr1 = s1.toString().toCharArray();
		    Arrays.sort(arr1);
		    char[] arr2 = s2.toString().toCharArray();
		    Arrays.sort(arr2);
		    if(Arrays.equals(arr1, arr2)){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
	
	public static boolean isPalindrome(char[] s, int n){
	    int i = 0; 
	    while(i < n){
	        if(s[i] != s[n-1-i]){
	            return false;
	        }
	        i++;
	    }
	    return true;
	}
}
