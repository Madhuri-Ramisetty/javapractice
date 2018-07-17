package oca;

public class Switch {
	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
		case 'A':
			System.out.println("marks>=80");
			break;
		case 'B':
			System.out.println("marks>=60");
			break;
		case 'C':
			System.out.println("marks>=40");
			break;
		case 'F':
			System.out.println("marks<40  fail");
			break;
		default:
			System.out.println("invalid grade");
			break;
		}
		
	}

}
