package task04;

public class ShortestString {

	public static void main(String[] args) {
		
		String str = "This is a ConsultAdd Training for Java";
		
		String[] s = str.split(" ");
		String shortest = s[0];
		String longest  = " ";
		
		for(String s1:s) {
			if(s1.length() < shortest.length()) {
				shortest = s1;
			} else if( s1.length() > longest.length()){
				longest = s1;
			}
		}
		System.out.println("Shortest word  : " + shortest);
		//System.out.println(("longest word : "+ longest));
		

	}

}
