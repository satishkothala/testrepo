package Mypack;

public class Test1 {

	public static void main(String[] args)
	{

		String[] s= {"java","java","c","ruby","c","python"};
		
		//System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			//System.out.println(s[i]);
	
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println(s[i]);
				}
			}
		}
	}

}
