import java.util.*;
import java.lang.*;
import java.io.*;
public class sample1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		System.out.println("Enter n value");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b.readLine());
		if (n>0)
		{
			System.out.println("Positive");
		}
		else if (n<0)
		{
			System.out.println("Negative");
		}
		else 
		{
			System.out.println("Zero");
		}
	}
}
