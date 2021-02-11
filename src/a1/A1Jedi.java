package a1;

import java.util.Scanner;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int items = scan.nextInt();
		String[] prod = new String[items];
		int[] count = new int[items];
		int[] npc = new int[items];
		for (int i = 0; i < items; i++) {
			String product = scan.next();
			scan.nextDouble();
			prod[i] = product;
			count[i] = 0;
			npc[i] = 0;
		}
		int numCust = scan.nextInt();
		for (int j = 0; j < numCust; j++) {
			scan.next();
			scan.next();
			ArrayList<String> custItems = new ArrayList<String>();
			int custItem = scan.nextInt();
			for (int k = 0; k < custItem; k++) {
				int itemN = scan.nextInt();
				String itemNa = scan.next();
				for (int i = 0; i < count.length; i++) {
					if (itemNa.equals(prod[i])) {
						count[i] += itemN;
						if (!(custItems.contains(itemNa))) {
							npc[i]++;
							custItems.add(itemNa);
						}

					}
				}
			}
		}
		for (int i = 0; i < prod.length; i++) {
			if (npc[i] == 0) {
				System.out.println("No customers bought " + prod[i]);
			} else {
				System.out.println(npc[i] + " customers bought " + count[i] + " " + prod[i]);

			}
		}
		scan.close();
	}
}

