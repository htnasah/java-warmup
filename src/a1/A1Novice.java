package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] names = new String[num];
		Double[] totals = new Double[num];
		for(int i = 0; i < num; i++){
			String fName = scan.next();
			String lName = scan.next();
			names[i] =  fName.substring(0,1) + '.' + lName + ':';
			int items = scan.nextInt();
			totals[i] = 0.0;
			for(int j = 0; j < items; j++) {
				int bought = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				totals[i] += bought * price;
			}
		}
		scan.close();
		for(int m = 0; m < num; m++){
			System.out.println(names[m] + " " + String.format("%.2f", totals[m]));
		}

	}

	// Your code follows here.

}
