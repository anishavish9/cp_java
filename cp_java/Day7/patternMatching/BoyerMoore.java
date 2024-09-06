package patternMatching;

public class BoyerMoore {
	static int NO_OF_CHARS = 256;


	static int max (int a, int b) 
	{ 
		return (a > b)? a: b;
	}      //returns max of two numbers

	static void badChar( char []str, int size,int badchar[]) {

		// Initialize all occurrences as -1
		for (int i = 0; i < NO_OF_CHARS; i++)
			badchar[i] = -1;

		// Fill the actual value of last occurrence of a character
		for (int i = 0; i < size; i++)
			badchar[(int) str[i]] = i;
	}

	static void search( char txt[], char pat[]) {
		int m = pat.length;
		int n = txt.length;

		int badchar[] = new int[NO_OF_CHARS];


		badChar(pat, m, badchar);

		int s = 0; 
		while(s <= (n - m)) {
			int j = m-1;

			/* Keep reducing index j of pattern while
                              characters of pattern and text are
                              matching at this shift s */
			while(j >= 0 && pat[j] == txt[s+j])
				j--;

			/* If the pattern is present at current
                              shift, then index j will become -1 after
                              the above loop */
			if (j < 0) {
				System.out.println("Patterns occur at shift = " + s);
				s += (s+m < n)? m-badchar[txt[s+m]] : 1;
			}
			else
				s += max(1, j - badchar[txt[s+j]]);
		}
	}

	public static void main(String []args) {

		char txt[] = "ABAAABCD".toCharArray();
		char pat[] = "ABC".toCharArray();
		search(txt, pat);
	}

}
