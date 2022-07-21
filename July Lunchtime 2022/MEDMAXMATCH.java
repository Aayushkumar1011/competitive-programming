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

        for (int t = 1; t <= test; t++) {
            // Read an int value
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();;
            }
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int[] med = new int[n];
            int mid = n/2;
            for(int i = 0; i < mid; i++){
                med[i] = arr1[i] + arr2[mid-i];
            }
            for(int i = mid; i < n; i++){
                med[i] = arr1[i] + arr2[n-1-i+mid];
            }
            Arrays.sort(med);
            if(n%2 == 0){
                System.out.println((med[n/2-1]+med[n/2])/2);
            }
            else{
                System.out.println(med[n/2]);
            }
        }
	    
	}
}

