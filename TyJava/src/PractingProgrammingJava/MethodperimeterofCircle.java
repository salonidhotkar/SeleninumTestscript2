package PractingProgrammingJava;

public class MethodperimeterofCircle {
	public static double areaofcircle(double r,double s)
	{
	return s*r*r;
	}
	   public static double perimeterofcircle(double r1, double s1)
	   {
	  return 2*s1*r1;
	   }
	   public static int areaofsquare(int a)
	   {
	  return a*a;
	   }
	   public static int perimeterofsquare(int a1)
	   {
	  return 4*a1;
	   }
	   public static int areaoftriangle(int e, int f, int g)
	   {
	  return (e*f*g)/2;
	   }
	   public static int perimeteroftriangle(int e1, int f1, int g1)
	   {
	  return e1+f1+g1;
	   }
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	       System.out.println(MethodperimeterofCircle.areaofcircle(2.0, 3.14));
	       System.out.println(MethodperimeterofCircle.perimeterofcircle(3.0, 3.14));
	       System.out.println(MethodperimeterofCircle.areaofsquare(4));
	       System.out.println(MethodperimeterofCircle.perimeterofsquare(5));
	       System.out.println(MethodperimeterofCircle.areaoftriangle(2, 3, 4));
	       System.out.println(MethodperimeterofCircle.perimeteroftriangle(5, 6, 7));
	}

	}


