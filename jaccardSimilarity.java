package CollectionFrameWork;
import java.util.*;
public class jaccardSimilarity {

	public static void main(String[] args) {
		String s1="Data is the new oil of the digital ceremony";
		String s2="Data is a new oil";
		String[] n1=s1.split(" ");
		String[] n2=s2.split(" ");
		Set<String>str1=new HashSet<>();
		Set<String>str2=new HashSet<>();
		for(int i=0;i<n1.length;i++) {
			str1.add(n1[i]);
		}
		System.out.println("Set are "+str1);
		for(int j=0;j<n2.length;j++) {
			str2.add(n2[j]);
		}
		System.out.println("Set are "+str2);
		Set<String>union=new HashSet<>(str1);
		union.addAll(str2);
		Set<String>intersection=new HashSet<>(str1);
		intersection.retainAll(str2);
		System.out.println("Set are "+union);
		System.out.println("Set are "+intersection);
		double denom=union.size();
		double nom=intersection.size();
		double jaccard_Similarity=(double)(nom)/(denom);
		System.out.println("Jaccard Similarity "+jaccard_Similarity);
	}

}
