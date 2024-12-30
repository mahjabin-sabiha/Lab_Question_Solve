package LabQuestion;

import java.io.*;
public class ConfusionMatrix {

	public static void main(String[] args) {
		try {
			
			File myFile=new File("C:\\Users\\Computer Garden\\Desktop\\jj\\confusion.txt");
			FileWriter writer=new FileWriter("C:\\Users\\Computer Garden\\Desktop\\jj\\confusion.txt");
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
	      String line;
	      int TP=0,FP=0;
	      int TN=0,FN=0;
	      while((line=reader.readLine())!=null) {
	    	  String[] parts=line.split(",");
	    	  String aa1=parts[1].trim();
	    	 
	    	  String aa2=parts[2].trim();
	   
	    	  
	    	  if(aa1.equals("Favor")&& aa2.equals("Favor")) {
	    		  TP++;
	    	  }
	    	  if(aa1.equals("Against")&& aa2.equals("Against")) {
	    		   TN++;
	    	  }
	    	  if(aa1.equals("Favor")&& aa2.equals("Against")) {
	    		  FN++;
	    	  }
	    	  if(aa1.equals("Against")&& aa2.equals("Favor")) {
	    		  FP++;
	    	  }
	      }
	      
	      double R=(double)(TP)/(TP+FN);
	      double P=(double)(TP)/(TP+FP);
	     double Acc=(double)(TP+TN)/(TP+FP+FN+TN);
	      double p=0.75;
	      double r=0.6;
	      double F1_score=(double)(2*p*r)/(p+r);
	      System.out.println("Recall: "+R);
	      System.out.println("Precision: "+P);
	      System.out.println("Accuracy: "+Acc);
	      System.out.println("F1-Score: "+F1_score);
	      System.out.println("TP: "+TP);
	      System.out.println("FP: "+FP);
	      System.out.println("FN: "+FN);
	      

	      
	      reader.close();
	}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
