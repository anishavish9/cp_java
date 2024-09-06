package patternMatching;

public class KnuthMorisPattern {

	public static void main(String[] args) {
		String text = "aabasbaddaabffeaad";
		String searchPatter = "aab";
		knuthMorisPattern(text,searchPatter);

	}

	private static void knuthMorisPattern(String text, String searchPatter) {
		int m = searchPatter.length();
		int n = text.length();
		int[] ps = new int[m];
		computeps(searchPatter,m,ps);
		int i=0; // for text array.
		int j=0; // for pattern array
		while(i<n) {
			if(searchPatter.charAt(j)==text.charAt(i)) {
				i++;
				j++;
			}
			if(j==m) {
				System.out.println("Pattern matched at index :"+(i-j));
				j= ps[j-1];
			}
			else if(i<n && searchPatter.charAt(j)!=text.charAt(i)) {
				if(j!=0) {
					j= ps[j-1];
				}
				else {
					i++;
				}
			}
		}
	}

	public static void computeps(String searchPatter,int m, int[] ps) {
		int len =0;//1-->0
		ps[0]=0;//{0,1, 0, }
		int i=1;
		while(i<m) {
			if(searchPatter.charAt(i)==searchPatter.charAt(len)) {
				len++;					//m=18
				ps[i]=len;				//searchPatter = "aab";
				i++;
			}
			else {
				if(len!=0) {
					len= ps[len-1];
				}
				else {
					ps[i] =0;
					i++;
				}
			}
		}

	}

}
