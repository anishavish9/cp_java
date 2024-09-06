package patternMatching;

public class NaivePatternMatching {

	public static void main(String[] args) {
		String text = "aabasbaddaabffeaad";
		String searchPatter = "aab";
		naivePatternMatching(text,searchPatter);


	}

	private static void naivePatternMatching(String text, String searchPatter) {
		int m = text.length();
		int n = searchPatter.length();
		int start=0,end=0;
		for(int i =0, j; i<=m-n; i++ ) {
			for(j =0; j<n; j++) {
				if(text.charAt(i+j) != searchPatter.charAt(j)) {
					break;
				}
				else {
					if(j==0) start = i+j;
				}
//				if(text.charAt(i+j) == searchPatter.charAt(j)) {
//					if(j==0) start = i+j;
//					
//				}
//				else {
//					break;
//				}
			}
			end=i+j-1;
		
			if(j==n) {
				System.out.println(
						"Matched patter found from index  :"+ start +" to " + end);
			}
		}

	}

}
