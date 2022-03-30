//Q8 wap to  check a given string contains 2 to 4 number of a specified chatrcter 
//example checkchar("javajava" ,"a")   a comes 2 to 4 times return true else false

package core_self_elv_lab_2;
import java.util.Scanner;
public class Quation_8 {
	
	void check(String s, char a)
	{
		int count = 0;
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)==a)
			{
				count++;
			}
		}
		if(count <=2 && count >=4)
		{
			System.out.println("True");
		}	
		else
		{
			System.out.println("False");
		}
	}

	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String ");
		String s = scan.next();
		System.out.println("Enter a character ");
		char a = (char) scan.nextByte();
		
	}
	}
