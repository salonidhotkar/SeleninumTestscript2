package MovieTicket;
import java.util.*;
public class DriverFirstSecondThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Movieticket empt = null;
		Scanner s1=new Scanner(System.in);
		System.out.println("Welcome to Movie Ticket");
		System.out.println("Enter the choice");
		System.out.println("First class");
		System.out.println("Second class");
		System.out.println("Third class");
		int choice=s1.nextInt();
	

	  switch(choice)
	  {
	      case 1:
	    empt=new FirstClass();
	    break;
	    
	      case 2:
	    	  empt=new SecondClass();
	  	    break;
	  	    
	      case 3:
	    	  empt=new ThirdClass();
	  	    break;
	  	    default:
	  	    System.out.println("Incorrect Choice");	
	    	  
	  }
	  
	  if(empt instanceof SecondClass)
	  {
		  SecondClass sc1=(SecondClass)empt;
		  System.out.println(sc1.price);
	  }
	  else if(empt instanceof FirstClass)
	  {
		  FirstClass fc1=(FirstClass)empt;
		  System.out.println(fc1.price);
	  }
	  
	  else
		  
	  {
		  ThirdClass tc1=(ThirdClass)empt;
		  System.out.println(tc1.price);
	  }
	 
    }
}
