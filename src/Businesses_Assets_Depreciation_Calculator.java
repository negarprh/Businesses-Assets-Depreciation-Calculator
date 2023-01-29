import java.util.Scanner;
public class Businesses_Assets_Depreciation_Calculator {


	//It is a Program to calculate Yearly Depreciation for Businesses.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Welcome Banner
		System.out.println("Welcome to Asset depreciation tool:");
		System.out.println("------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		
		
		// Prompt user
		System.out.println("Enter the values(Price, Salvage value, and Years used) with space between them:");
		
		 //Variable declaration
		int P = input.nextInt();
		int S = input.nextInt();
		int Y = input.nextInt();
		
		//Formula declaration for calculations
		double yearlyDepreciation, yearlyDepreciationP, yearsSalvage50;
		yearlyDepreciation = (P-S)/Y;
		yearlyDepreciationP = (yearlyDepreciation/P)*100;
		yearsSalvage50 = (P/2)/yearlyDepreciation;
		
		//Output
		System.out.println("yearly Depreciation = " + "$" + ""+yearlyDepreciation+"");
		System.out.println("yearly Depreciation % ="+yearlyDepreciationP+" %");
		System.out.println("Number of years for salvage value to become 50% of purchase price = "+(String.format("%.2f",yearsSalvage50))+" years");
		
		//Closing Massage
		System.out.println("");
		System.out.println("Thank you for using Asset depreciation tool.");
		System.out.println("See you next time.");


	}

}

