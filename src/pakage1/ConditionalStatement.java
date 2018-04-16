package pakage1;

import java.io.InputStream;
import java.util.Scanner;


public class ConditionalStatement {
	
	public static void main(String[] args) {
		
/* Incryption/decryption
 
		int x=5; // 0000 0000 0000 0000 0000 0000 0000 0101
		int y=7; // 0000 0000 0000 0000 0000 0000 0000 0111
//left shift
// one left shift means, number multiple by 2^1 = 5*2
// two left shift means, number multiple by 2^2 = 5*2*2
// 3   left shift means, number multiple by 2^3 = 5*2*2*2
		x = x<<2;// --00 0000 0000 0000 0000 0000 0000 0101 00   // now 20
	
// Right shift
// one R shift means, number divided by 2^1 = 5/2
// two R shift means, number divided by 2^2 = 5/(2*2)
// 3   R shift means, number divided by 2^3 = 5/(2*2*2)
		y = y>>2;// 00 0000 0000 0000 0000 0000 0000 0000 01
*/
		
		
/*
 TERNARY OPERATOR		
		int z = 0;
		String str;
		str = (z==0)? "AAAA":"BBBB";
	    System.out.println(str);
*/
		
/*		
		Scanner scobj = new Scanner(System.in);
		System.out.println("enter age");
		
		int age = scobj.nextInt();
		
		//String gender = "female";
		
		if(age <= 10)
		{
			System.out.println("child");
			if (age < 5)
			{
				System.out.println("infant");
			}
		}
		else if (age > 10 || age <=18)
		{
			System.out.println("teenage");
		}
		else
		{
			System.out.println("above teenage");
		}
*/
		System.out.println("main ends");
	}

}
