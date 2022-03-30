//Q 1 WAP to ask a number and print sum and count and average  of digits .

package core_self_elv_lab_2;
import java.util.Scanner;
public class Quation_1 {
	Scanner scan = new Scanner(System.in);
	static int a,b;
	void accept()
	{
		System.out.println("Enter 1st number ");
		a = scan.nextInt();
		System.out.println("Enter 2nd number ");
		b = scan.nextInt();
	}
	
	void sum()
	{
		System.out.println("Sum of entered numbers is "+(a+b));
	}
	void avarage()
	{
		System.out.println("Avarage of entered numbers is "+(a+b)/2);
	}
	
	public static void main(String[] args) 
	{
		Quation_1 q = new Quation_1();
		q.accept();
		q.sum();
		q.avarage();
	}

}
