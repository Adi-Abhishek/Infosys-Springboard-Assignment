package demo;

public class SelectionAssignment2 {
	public static void main(String[] args) {
		// Implement your code here 
		int a =1;
		int b=4;
		int c=4;
		double discriminant= b*b-4*a*c;
		if(discriminant > 0){
		double root1 =(-b + Math.sqrt(discriminant)) / (2*a);
		double root2 =(-b - Math.sqrt(discriminant)) / (2*a);
		System.out.println("Root is " + root1);
		System.out.println("Root is " + root2);
		}
		else if(discriminant ==0){
		double root = -b/(2*a);
		System.out.println("Root: " + root);
		}
		else
		{
		System.out.println("The equation has no real roots");
		}
	}


}
