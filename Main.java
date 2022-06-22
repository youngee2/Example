package D22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		
		Person person = new Person(name, school, grade);
		
		person.print();

		sc.close();
	}
}