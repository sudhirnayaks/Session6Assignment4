package session6;

import java.util.Scanner;

public class Assignment4 {

	private static Scanner sc;

	void enterAge(int age) throws NegativeAgeException{
		if (age < 0){
			new NegativeAgeException();
		}else{
			System.out.println("No Exception Thrown");
		}
		
	}
	
	public static void main(String[] args) {
		Assignment4 obj = new Assignment4();
		sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		try{
			int age_entered = sc.nextInt(); 
			obj.enterAge(age_entered);
		}
		catch(NegativeAgeException e){
			e.printStackTrace();
			
		}

	}

}
