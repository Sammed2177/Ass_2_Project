//Q 2 wap to check whether a single digit number is automorphic number or not .
// automorphic number is number whose square ends with number itself  i.e.     5 * 5 =25 
// if automorphic display "its automorphic number else not automorphic .

package core_self_elv_lab_2;
import java.util.*;
public class Quation_2 {
	
	static int num,sqr,x, a ;
	static int c = 0;
	Scanner scan = new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter the number ");
		num = scan.nextInt();
	}
	
	void check()
	{
		a = num;
		sqr = num * num;
		while(a > 0)
		{
			c++;
			a = a/10;
		}
		
		x = (int)Math.pow(10, c);
				
				if(num == x)
					System.out.println("It is an Automorphoc number");
				else
					System.out.println("It is an Automorphoc number");
		
	}
	
	public static void main(String[] args) {
		
		Quation_2 q =new Quation_2();
		q.accept();
		q.check();
	
	}

}
