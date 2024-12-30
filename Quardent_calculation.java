package LabQuestion;
import java.util.Scanner;
public class Quardent_calculation {

	public static void main(String[] args) {
		double x;
		double y;
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		 x=sc.nextDouble();
		 y=sc.nextDouble();
		 if(x==0 && y==0) {
			 System.out.println("This is origin");
		 }
		 if(x!=0 && y==0) {
			 System.out.println("This is x axis");
		 }
		 if(x==0 && y!=0) {
			 System.out.println("This is y axis");
		 }
		 if(x>0 && y>0) {
			 System.out.println("This is 1st quardent");
			 
		 }
		 if(x<0 && y>0 ) {
			 System.out.println("This is 2nd quardent");
		 }
		 if(x<0 && y<0) {
			 System.out.println("This is 3rd quardent");
		 }
		 if(x>0 && y<0) {
			 System.out.println("This is 4Th quardent");
		 }
	}

}
