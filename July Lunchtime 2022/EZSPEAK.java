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
		char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
		Set<Character> set = new HashSet<>();
		for(int i = 0; i <5; i++)
		    set.add(vowels[i]);
		    
		for(int t = 1; t <= test; t++){
		    int n = sc.nextInt();
		    String s = sc.next();
		  int count = 0;
		  for(char ch : s.toCharArray()){
		      if(!set.contains(ch)){
		          count++;
				  if(count >= 4){
					  break;
				  }
		      }
		      else {
		          count = 0;
		      } 
		  }
		  if(count >= 4){
		          System.out.println("NO");
		  }
	      else{
	          System.out.println("YES");
	      }
		  
		}
		
	}
}

