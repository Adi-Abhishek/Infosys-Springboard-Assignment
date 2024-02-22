package demo;

public class SelectAssignment3 {
	public static void main(String[] args) {
		// Implement your code here 
		
        int num1 = 1;
        int num2 = 5;
        int num3 = 3;

        // Check if any number is 7
        if (num1 == 7) {
            // If 7 is the last number, display -1
            if (num2 == 7 || num3 == 7) {
                System.out.println("-1");
            } else {
                // Calculate product of num2 and num3
                System.out.println(num2 * num3);
            }
        } else if (num2 == 7) {
            // If 7 is the last number, display -1
            if (num3 == 7) {
                System.out.println("-1");
            } else {
                // Calculate product of num3
                System.out.println(num3);
            }
        } else {
            // If no 7 is present, calculate product of all three numbers
            System.out.println(num1 * num2 * num3);
        }
    }
}
