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
		long t = sc.nextLong();
		while(t-->0){
		    long n =sc.nextLong();
		    long ans=0;
		    
		    if(n==1){
		        ans += 20;
		    }
		    else if(n==2){
		        ans += 36;
		    }
		    else if(n==3){
		        ans += 51;
		    }
		    else{
		        ans=(n/4)*44;
		        
		        if(n%4==0){
		            ans+=16;
		        }
		        else if(n%4==1){
		            ans+=32;
		        }
		        else if(n%4==2){
		            ans+=44;
		        }
		        else if(n%4==3){
		            ans+=55;
		        }
		    }
		        
		        
		    System.out.println(ans);
		}
		
	}
}
