package LabQuestion;
import java.util.*;
import java.io.*;
public class Student_course {

	public static void main(String[] args) {
		try {
			File myFile=new File("C:\\Users\\Computer Garden\\Desktop\\jj\\cse311.txt");
			File myFile2=new File("C:\\Users\\Computer Garden\\Desktop\\jj\\cse111.txt");
			FileWriter w1=new FileWriter(myFile);
			FileWriter w2=new FileWriter(myFile2);
			w1.write("std A, std B,std C");
			w2.write("std A, std B,std C,std D,std E");
			w1.close();
			w2.close();
			
			Set<String>cse311=new TreeSet<String>();
			BufferedReader br= new BufferedReader(new FileReader(myFile));
			String line;
			while((line=br.readLine())!=null) {
				String[] token=line.split(",");
				for(String part :token) {
					cse311.add(part.trim());
				}
				
			}
			Set<String>cse111=new TreeSet<String>();
			BufferedReader cr= new BufferedReader(new FileReader(myFile2));
			String l;
			while((l=cr.readLine())!=null) {
				String[] token2=l.split(",");
				for(String p :token2) {
					cse111.add(p.trim());
				}
			
			
		}
			System.out.println("Student of 311: ");
			int i=0;
			for(String std:cse311) {
				System.out.println(std+" ");
				i++;
			}
			System.out.println("Number of student of cse 311 "+i);
			System.out.println("Student of 111: ");
			int j=0;
			for(String std:cse311) {
				System.out.println(std+" ");
				j++;
			}
			System.out.println("Number of student of cse 111 "+j);
	}
		catch(IOException e) {
			System.out.println("Errror");
		}
	}

}
