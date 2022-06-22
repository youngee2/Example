package D22;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		int i = 0;

		if (100 >= num) {
			while (true) {
				if (num > i) {
					++i;
					sum += i;
				} else
					break;
			}
		}
		sc.close();
		System.out.println(sum);
	}
}