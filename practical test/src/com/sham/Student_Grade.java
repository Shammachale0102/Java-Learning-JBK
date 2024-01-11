package com.sham;
import java.util.Scanner;

public class Student_Grade
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter The Five Subject Marks :");
			int m1 = input.nextInt();
			int m2 = input.nextInt();
			int m3 = input.nextInt();
			int m4 = input.nextInt();
			int m5 = input.nextInt();
			int tot = m1+m2+m3+m4+m5;
			float per = tot/5;
			System.out.println("Total :"+tot);
			System.out.println("Percentage :"+per);	
			if(per>=75)
				System.out.println("Distinction");
			else if(per>=60)
				System.out.println("First Class");
			else if(per>=50)
				System.out.println("Second Class");
			else if(per>=40)
				System.out.println("Pass Class");
			else if(per<40)
				System.out.println("Fail");
			else
				System.out.println("Grade F");
		}
	}
}