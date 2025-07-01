/**
 * 
 */
package q3;

import java.util.Scanner;

public class TestMIXChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a MIX string: ");
        String line = scanner.nextLine();
        
        // 1) Validate
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!MIXChar.isMIXChar(c)) {
                System.err.printf(
                    "Error: character '%c' at position %d is not a valid MIX character.%n",
                    c, i
                );
                scanner.close();
                return;
            }
        }
        
        try {
            // 2) Convert to MIXChar[]
            MIXChar[] mixChars = MIXChar.toMIXChar(line);
            
            // 3) Print their numeric values
            System.out.print("Ordinals: ");
            for (MIXChar mc : mixChars) {
                System.out.print(mc.ordinal() + " ");
            }
            System.out.println();
            
            // 4) Pack into Message and print longs
            Message msg = new Message(mixChars);
            System.out.println("Packed longs: " + msg.toLongs());
            
            // 5) Decode back to String
            System.out.println("Decoded back: " + msg.toString());
            
        } catch (IllegalArgumentException e) {
            // should never happen after our isMIXChar check,
            // but we still guard against it
            System.err.println("Conversion error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
