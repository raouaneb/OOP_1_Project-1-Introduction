// Algorithm 1 : Simple Cipher Program
// This program presents a 6-piece puzzle authentication challenge for Project-S access.
// It generates 6 sets of integer variables for each piece of the 6-piece puzzle and performs mathematical operations to obtain values for each piece.
// These values are then converted to strings for formatting.
// It prints the variables in expected format for them to fit in the puzzle's structure and displays a closing message.

package Challenge_1_Cipher_Puzzle;

public class main {

	public static void main(String[] args) {

		// Display of a welcome message
		System.out.println("Project-S Access System: 6-Piece Puzzle Authentication Challenge:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(); //Add an empty line

		// Generation of variables for each piece of the puzzle

		// Piece 1
		int a = 7;
		int b = 5;
		int c = a/b + a%5;

		// Piece 2
		int d = 8;
		int e = 3;
		int f = d/e + d%e;

		// Piece 3
		int g = 4;
		int h = 2;
		int i = g/h + g%h;

		// Piece 4
		int j = 20;
		int k = 14;
		int l = j/k + j%k;

		// Piece 5
		int m = 9;
		int n = 3;
		int o = m/n + m%n;

		// Piece 6
		int p = 45;
		int q = 20;
		int r = p/q + p%q;

		// Converting the variables to strings for formatting
		String aAsString = Integer.toString(a);
		String bAsString = Integer.toString(b);
		String cAsString = Integer.toString(c);

		String dAsString = Integer.toString(d);
		String eAsString = Integer.toString(e);
		String fAsString = Integer.toString(f);

		String gAsString = Integer.toString(g);
		String hAsString = Integer.toString(h);
		String iAsString = Integer.toString(i);

		String jAsString = Integer.toString(j);
		String kAsString = Integer.toString(k);
		String lAsString = Integer.toString(l);

		String mAsString = Integer.toString(m);
		String nAsString = Integer.toString(n);
		String oAsString = Integer.toString(o);

		String pAsString = Integer.toString(p);
		String qAsString = Integer.toString(q);
		String rAsString = Integer.toString(r);

		// Printing 6-Piece puzzle with expected format
		System.out.println(aAsString+"  @  "+bAsString + "       "+ dAsString+"  @  "+eAsString+ "        "+ gAsString+"  @  "+hAsString + "        " + jAsString+"  @  "+kAsString+ "        "+ mAsString+"  @  "+nAsString+ "        "+ pAsString+"  @  "+qAsString);
		System.out.println("   " + "|" + "   " + "          "+"|" + "              "+"|" + "               "+"|" + "               "+"|" + "               "+"|");
		System.out.println("   " + cAsString + "   " + "          "+fAsString + "              "+iAsString + "               "+lAsString + "               "+oAsString + "               "+rAsString);

		// Display of a complimentary-close message
		System.out.println("\nAt Project-S, we employ multi-factor authentication because one password is never enough.");
	}
}
