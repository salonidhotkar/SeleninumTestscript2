package String;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		String s1="KARANATAKA";
		int count=0;
		String arr[]=s1.split("");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].equals("A"))
				count++;
		}
		System.out.println(s1+"contains"+count+"occurance of'A'");
		
		
	}

}
