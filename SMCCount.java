package CollectionFrameWork;
import java.util.*;
import java.util.Scanner;
public class SMCCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String[] token=s1.split(" ");
		String[] token2=s2.split(" ");
		int f01=0,f10=0,f00=0,f11=0;
		for(int i=0;i<token.length;i++) {
			String count1=token[i];
			String count2=token2[i];
			
			if(count1.equals("0") && count2.equals("1"))
				
				f01++;
			if(count1.equals("1") && count2.equals("0")) 
				f10++;
			if(count1.equals("0") && count2.equals("0")) {
					f00++;
					if(count1.equals("1") && count2.equals("1")) 
						f11++;
		}
		
			
		}
		double p=(f11+f00);
		double t=(f01+f10+f11+f00);
		double SMC=(double)p/(double)(t);
			
		System.out.println("F01 "+f01);
		System.out.println("F10 "+f10);
		System.out.println("F00 "+f00);
		System.out.println("F11 "+f11);
		
		
		System.out.println("Simple Matching coefficient :"+SMC);

	}

}
