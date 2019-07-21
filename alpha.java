import java.io*;
public class alpha()
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		char c=b.readLine();
		if ((c>='a'&& c<='z')||(c>='a'&& c<='z'))
		{
		System.out.println("Alphabet");
		}
		else
		{
		System.out.println("Not an alphabet");
		}
	}	
}