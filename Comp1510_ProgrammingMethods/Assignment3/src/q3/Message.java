/**
 * 
 */
package q3;

/**
 * 
 */
public class Message {
    private static final int CHARS_PER_LONG = 11;
    private static final long RADIX = 56L;

    private static final long[] POW = new long[CHARS_PER_LONG];
    static {
        POW[0] = 1;
        for (int i = 1; i < CHARS_PER_LONG; i++) {
            POW[i] = POW[i - 1] * RADIX;
        }
    }

    private final long[] words;
    private final int count;   

    public Message(MIXChar[] m) {
        this.count = m.length;
        int numWords = (count + CHARS_PER_LONG - 1) / CHARS_PER_LONG;
        this.words = new long[numWords];

        for (int i = 0; i < count; i++) {
            int block = i / CHARS_PER_LONG;
            words[block] = words[block] * RADIX + m[i].ordinal();
        }
    }

    public Message(String s) {
        this(MIXChar.toMIXChar(s));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(count);

        for (int w = 0; w < words.length; w++) {
            long word = words[w];
            int charsInThis = (w == words.length - 1 && count % CHARS_PER_LONG != 0)
                                ? count % CHARS_PER_LONG
                                : CHARS_PER_LONG;

            for (int pos = charsInThis - 1; pos >= 0; pos--) {
                long placeValue = POW[pos];
                int ord = (int) Long.divideUnsigned(word, placeValue);
                word = Long.remainderUnsigned(word, placeValue);
                sb.append( MIXChar.MIX[ord] ); 
            }
        }

        return sb.toString();
    }

    public String toLongs() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append( Long.toUnsignedString(words[i]) );
        }
        return sb.toString();
    }

    public int getCount() {
        return count;
    }

    public long[] getWords() {
        return words.clone();
    }
}
