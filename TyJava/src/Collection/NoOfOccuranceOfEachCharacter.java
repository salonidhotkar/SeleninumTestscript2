package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class NoOfOccuranceOfEachCharacter {
	
		public static void main(String[] args) {
			String s1="wellcome";
			HashMap<Character, Integer> data=new HashMap<>();
			int count=0;
			char ch[]=s1.toCharArray();
			for(int i=0; i<ch.length; i++)
			{
				count=0;
				for(int j=0; j<ch.length; j++)
				{
					if((ch[i]==ch[j]))
					{
						count++;
					}
				}
			       data.put(ch[i],count);
			}
			System.out.println(data);
			for(Entry<Character,Integer>i:data.entrySet())
			{
				if(i.getValue()>1)
				{
					System.out.println("Duplicate Characters is:"+i.getKey());
				}
			}
		}

}
