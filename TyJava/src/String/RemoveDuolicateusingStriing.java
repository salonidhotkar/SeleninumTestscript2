package String;

public class RemoveDuolicateusingStriing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s1="ssaalloonnii";
		String s2=" ";
		            
		char arr[]=s1.toCharArray();
		for(int i=0; i<arr.length; i++) {
		
			if(s2.indexOf(arr[i])==-1){
					
				            s2=s2+arr[i];
	      }
					
		}			
		
         System.out.println(s2);

	}

}
