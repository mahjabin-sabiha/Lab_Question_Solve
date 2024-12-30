package LabQuestion;
import java.util.*;
import java.io.*;
public class CricketPlayerSalary {

	public static void main(String[] args) {
		try {		
		File myFile=new File("C:\\Users\\Computer Garden\\Desktop\\jj\\cricket.txt");
		if(myFile.createNewFile()) {
			System.out.println("Yes");
		}
			BufferedReader br=new BufferedReader(new FileReader(myFile));
			String line;
			while((line=br.readLine())!=null) {
				
				System.out.println(line);
			}
			Map<String,Integer>m1=new HashMap<String,Integer>();
			//Map<String,Integer>m2=new HashMap<String,Integer>();
			m1.put("Player C", 250000);
			m1.put("Player B", null);
			m1.put("Player A", 300000);
			System.out.println("m1");
			for(Map.Entry m:m1.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
			if(m1.containsKey("Player A")) {
				int updatesalary=m1.get("Player A")+50000;
				m1.put("Player A", updatesalary);
			}
			System.out.println("************************************");
			System.out.println("After update salary");
			for(Map.Entry m:m1.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		
		
		
	
		catch(IOException e) {
			System.out.println("Error");
		}

}
}
