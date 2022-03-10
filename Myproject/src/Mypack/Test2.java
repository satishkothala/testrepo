package Mypack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) 
	{
		
//		String[] s= {"java","java","c","ruby","c","python"};
//		
//		Set<String> s1=new HashSet<String>();
//		for(String name :s)
//			if(s1.add(name)==false)
//			{
//				System.out.println("dulicate :"+name);
//			}

		List<String> s=new ArrayList<String>();
		s.add("2");
		s.add("34");
		s.add("7");
		 s.add("7");
//		System.out.println(s);
		
		Set<String> sa=new HashSet<String>(s);
		
		for(String name :sa)
		{
			System.out.println(name);
		}
		
		
		
		
	}

}
