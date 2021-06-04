package prolim.phase1.day4;

import java.util.Scanner;

public class CustomException {

	static void validate (int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not valid");
		} else {
			System.out.println("Welcome to vote");
		}
		
	}
	
	static void validateSalary(int salary) throws SalaryLowException, SalaryOKException, SalaryHighException {
		if (salary <= 2000) {
			throw new SalaryLowException("You need to work hard");
		} else if (salary >= 2100 && salary <= 5000) {
			throw new SalaryOKException("Your salary is somehow good");
		} else if (salary >= 5100 && salary <= 9000) {
			throw new SalaryHighException("Salary is very good");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			validate(17);
//		} catch (Exception e) {
//			System.out.println("Exception occured: " + e.getMessage());
//		}
		
		Scanner sc = new Scanner(System.in);
		int salary = 0;
		System.out.print("Input salary: ");
		while (true) {
			salary = sc.nextInt();
			if (salary < 0) {
				System.out.print("Salary cannot be negative, input again: ");
			} else if (salary > 2000 && salary < 2100) {
				System.out.print("Invalid salary, input again: ");
			} else if (salary > 5000 && salary < 5100) {
				System.out.print("Invalid salary, input again: ");
			} else if (salary > 9000) {
				System.out.print("Invalid salary, input again: ");
			} else {
				break;
			}
		}
		try {
			validateSalary(salary);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
		
	}

}

class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String s) {
		super(s);
	}
	
}

class SalaryLowException extends Exception {
	
	public SalaryLowException (String s) {
		super(s);
	}
	
}

class SalaryOKException extends Exception {
	
	public SalaryOKException (String s) {
		super(s);
	}
	
}

class SalaryHighException extends Exception {
	
	public SalaryHighException (String s) {
		super(s);
	}
	
}