package exception;

public class DriverClassCastException {

	public static void main(String[] args) {
    
		ClasscastChild c1= new ClasscastChild();
		ClassCastException p1= new ClassCastException();
		
		
        ClasscastChild c2=(ClasscastChild)p1;
	}

}
