package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int items = scan.nextInt();
		String[] prod = new String[items];
		Double[] prices = new Double[items];
		for (int i = 0; i < items; i++) {
			String product = scan.next();
			Double price = scan.nextDouble();
			prod[i] = product;
			prices[i] = price;
		}
		int numCust = scan.nextInt();
		String[] names = new String[numCust];
		Double[] totals = new Double[numCust];
		Double tot = 0.0;
		for(int j = 0; j < numCust; j++){
			names[j] = scan.next() + " " + scan.next();
			int custItems = scan.nextInt();
			for (int k = 0; k < custItems; k++){
				int itemN = scan.nextInt();
				String itemNa = scan.next();
				tot += priceCalculator(prod, prices, itemN, itemNa);
			}
			totals[j] = tot;
			tot = 0.0;
		}
		scan.close();
		System.out.println("Biggest: " + names[findMax(totals)] + " (" + String.format("%.2f", totals[findMax(totals)]) + ")" + "\nSmallest: " + names[findMin(totals)] + " (" + String.format("%.2f", totals[findMin(totals)]) + ")" + "\nAverage: " + String.format("%.2f", avg(totals)));
	}
	public static double priceCalculator(String[] pr, Double[] pri, int num, String prd){
		double cost = 0.0;
		for(int i = 0; i < pr.length; i++) {
			if (pr[i].equals(prd)) {
				cost += pri[i] * num;
			}
		}
		return cost;
	}
	public static int findMin(Double[] total){
		Double min = total[0];
		int indexMin = 0;
		for(int i = 0; i < total.length; i++){
			if(total[i] < min){
				min = total[i];
				indexMin = i;
			}
		}
		return indexMin;
	}
	public static int findMax(Double[] total) {
		Double max = total[0];
		int indexMax = 0;
		for(int i = 0; i < total.length; i++){
			if(total[i] > max){
				max = total[i];
				indexMax = i;
			}
		}
		return indexMax;
	}
	public static double avg(Double[] total){
		double sum = 0;
		for(double tot : total){
			sum += tot;
		}
		return sum/(total.length);
	}



}
