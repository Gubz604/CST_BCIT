/**
 * 
 */
package q3;

/**
 * 
 */
public class MIXChar {

	public static char[] MIX = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', '\u0394', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'R', '\u03A3', '\u03A0', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9', '.', ',', '(', ')', '+', '-', '*', '/', '=', '$', '<', '>', '@', ';', ':', '\'' };

	public static boolean isMIXChar(char c) {
		boolean isMix = false;

		for (char MIXchar : MIX) {
			if (MIXchar == c)
				isMix = true;
		}

		return isMix;
	}

	private final char mixChar;
	private final int mixIndex;

	public MIXChar(char c) {
		int idx = -1;
		for (int i = 0; i < MIX.length; i++) {
			if (MIX[i] == c) {
				idx = i;
				break;
			}
		}
		if (idx < 0) {
			throw new IllegalArgumentException("Not a valid MIX character: " + c);
		}
		this.mixIndex = idx;
		this.mixChar = c;
	}

	public char toChar() {
		return mixChar;
	}

	public static MIXChar[] toMIXChar(String s) {
		MIXChar[] result = new MIXChar[s.length()];
		for (int i = 0; i < s.length(); i++) {
			MIXChar mixChar = new MIXChar(s.charAt(i));
			result[i] = mixChar;
		}

		return result;
	}

	public int ordinal() {
		return mixIndex;
	}

	@Override
	public String toString() {
		return Character.toString(mixChar);
	}
}
