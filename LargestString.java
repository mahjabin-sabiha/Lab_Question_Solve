package LabQuestion;

public class LargestString {

	public static void main(String[] args) {
		String str="When God Closes all the doors somewhere he leaves a little window open";
		String[] token=str.split(" ");
		String largest=token[0];
	
		for(int i=1;i<token.length;i++) {
			if(largest.length()<token[i].length()) {
			largest=token[i];
			}
		}
		System.out.println(largest);
		
	
	}

}
