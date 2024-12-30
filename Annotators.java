package LabQuestion;
import  java.io.*;
import java.util.*;

public class Annotators {

	public static void main(String[] args) {
		try {
		List<String>ls1=new LinkedList<String>();
		List<String>ls2=new LinkedList<String>();
		
		File myFile=new File("C:\\Users\\Computer Garden\\Desktop\\jj\\sabiha.txt");
		FileWriter writer=new FileWriter("C:\\Users\\Computer Garden\\Desktop\\jj\\sabiha.txt");
		writer.write("Doc1,Favor,Against\n");
		writer.write("Doc2,Favor,Favor\n");   
		writer.write("Doc3,Against,Against\n");
		writer.write("Doc4,Favor,Favor\n");
		writer.write("Doc5,Against,Favor\n");
		writer.write("Doc6,Against,Against\n");
		writer.write("Doc7,Against,Against\n");
		writer.write("Doc8,Favor,Favor\n");
		writer.write("Doc9,Favor,Against\n");
		writer.write("Doc10,Against,Against\n");
      writer.close();
		BufferedReader reader=new BufferedReader(new FileReader(myFile));
		if(myFile.createNewFile()) {
			System.out.println("Yes");
		}
		String line;
		while((line=reader.readLine())!=null) {
			String[] parts=line.split(",");
			String aa1=parts[1].trim();
			ls1.add(aa1);
			String aa2=parts[2].trim();
			ls2.add(aa2);
			 
			
				
			}
		//count only Favor ,Against of column one.
		String col1=null;
		int F1=0,A1=0;
		for(int i=0;i<ls1.size();i++) {
			
			col1=ls1.get(i);
			if(col1.equals("Favor")) {
				F1++;
			}
			if(col1.equals("Against")){
				A1++;
			}
		}
			//count only Favor ,Against of column Two.
			String col2=null;
			int F2=0,A2=0;
			for(int j=0;j<ls2.size();j++) {
				
				col2=ls2.get(j);
				if(col2.equals("Favor")) {
					F2++;
				}
				 if(col2.equals("Against")){
					A2++;
				}
			}
				//count Favor-Favor ,Against-Against
				int FF=0,AA=0;
				for(int i=0;i<ls1.size();i++) {
					
					col1=ls1.get(i);col2=ls2.get(i);
					if(col1.equals("Favor") && col2.equals("Favor")) {
						FF++;
					}
					if(col1.equals("Against") && col2.equals("Against")){
						AA++;
					}
				}
					double po=(FF+AA)/10.0;
					double p_Favor=(F1/10.0)*(F2/10.0);
					double p_Against=(A1/10.0)*(A2/10.0);
					double pe=p_Favor+p_Against;
					double x=po-pe;
					double y=1-pe;
					double kappa=x/y;
					System.out.println("Favor in column 1: "+F1);
					System.out.println("Favor in column 2: "+F2);
					
					System.out.println("Against in column 1: "+A1);
					System.out.println("Against in column 2: "+A2);
					
					System.out.println("Favor-Favor in column 1: "+FF);
					System.out.println("Against-Against in column 1: "+AA);
					
					System.out.println("Kappa : "+kappa);
					
				reader.close();
		
				
			
		}
			catch(IOException e) {
				System.out.println("error");
				System.out.println(e);
				
			}
		}
}
		
		

	


