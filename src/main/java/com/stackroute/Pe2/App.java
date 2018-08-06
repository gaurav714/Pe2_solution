package com.stackroute.Pe2;

/**
 * Hello world!
 *
 */
public class App 
{//questin1
	public boolean palindrome(String str) 
	{
		
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			return true;
		}
		else
			return false;
	}
//question2
	public int powFour(int n)
	{
		while(n != 1)
		  {    
		   if(n % 4 != 0)
		      return 0;
		    n = n / 4;      
		  }
		  return 4;
		}
}
