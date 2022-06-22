package D22;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h=sc.nextInt();
		int w=sc.nextInt();
		
		int ob = w+100-h;
		System.out.println(ob);
		if(ob>0) {
			System.out.println("Obesity");
		}
		sc.close();
	}
}