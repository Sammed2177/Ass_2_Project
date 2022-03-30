// Q7 WAP to check if given string starts with "java"  return true otherwise return false.

// hint f = str.substring(0,4)

package core_self_elv_lab_2;

import java.util.Scanner;

public class Quation_7 {

	Scanner scan = new Scanner(System.in);
	static String s,r;
	static String a = "java";
	
	void check()
	{
		System.out.println("Enter a string ");
		s = scan.nextLine();
		r = s.substring(0, 4);
		
		if(r.equals(a))
		{
			System.out.println("True");
		}
		else
			System.out.println("Flase");
	}
	
	public static void main(String[] args) {
		
		Quation_7 q = new Quation_7();
		q.check();
	
	}
}
