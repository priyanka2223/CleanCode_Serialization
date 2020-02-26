package cleanCode_construction;

import java.util.Scanner;

public class Construction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of the house : ");
		double feet = sc.nextDouble();
		System.out.println("Select the options for the Home Construction : ");
		System.out.println("1. Standard Materials");
		System.out.println("2. Above Standard Materials");
		System.out.println("3. High Standard Material");
		System.out.println("4. High Standard Material and Fully Automated Home");
		int option = sc.nextInt();
		Material obj = new Material();
		double ans=0;
		switch(option){
		case 1:ans = obj.standard(feet);break;
		case 2:ans = obj.aboveStandard(feet);break;
		case 3:ans = obj.highStandard(feet);break;
		case 4:ans = obj.highStandardFullyAutomated(feet);break;
		default:break;
		}
		System.out.println("The total construction cost : "+ans);
	}

}
