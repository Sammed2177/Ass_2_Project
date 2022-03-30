// Q 5 WAP to ask string from user and convert each word to upper case like 
// Input = welcome to java 
// Output = Welcome To Java

package core_self_elv_lab_2;
import java.util.Scanner;
public class Quation_5 {

	Scanner scan = new Scanner(System.in);
	void convert()
	{
	System.out.println("Enter any string ");
	String s = scan.nextLine();
	String temp = "";
	String a = "";
	for(int i = 0; i < s.length(); i++)
	{
		a = s.substring(0,1).toUpperCase()+s.substring(1);
		temp = a.concat(s);
	}
	System.out.println(temp);
	}
	public static void main(String[] args) {
		
		Quation_5 q = new Quation_5();
		q.convert();
	}

}
