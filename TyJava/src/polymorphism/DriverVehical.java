package polymorphism;

public class DriverVehical {
	
	public void noofwheels(Vehical v)
	{
		v.wheels();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Bike b1=new Bike();
		DriverVehical d1=new DriverVehical();
		d1.noofwheels (b1);
		Auto a1=new Auto();
		d1.noofwheels (a1);
		Vehical v1=new Vehical();
		d1.noofwheels(v1);
		
		
	}

}
