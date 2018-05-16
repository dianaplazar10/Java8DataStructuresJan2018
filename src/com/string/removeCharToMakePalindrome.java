package com.string;

//http://codereview.stackexchange.com/questions/135009/finding-the-index-of-the-character-whose-removal-will-make-a-palindrome
import java.util.Scanner;
import java.util.stream.IntStream;

public class removeCharToMakePalindrome {

    public static int isOnePastPalindrome(final String s) {
        final int stringLength = s.length();

        for (int indexOfIgnoredCharacter = -1;
                indexOfIgnoredCharacter < stringLength;
                indexOfIgnoredCharacter++) {
            if (isOnePastPalindrome(s, indexOfIgnoredCharacter)) {
                return indexOfIgnoredCharacter;
            }
        }

        return -1;
    }

    private static boolean isOnePastPalindrome(final String s, 
                                               final int ignoreIndex) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (leftIndex == ignoreIndex) {
                // Just omit the character at index leftIndex (which is the same
                // as ignoreIndex).
                leftIndex++;
            } else if (rightIndex == ignoreIndex) {
                // Same fro the right index.
                rightIndex--;
            } else {
                if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                    // Mismatch. Removing the character at index 'ignoreIndex'
                    // will not make this string a palindrome.
                    return false;
                }

                leftIndex++;
                rightIndex--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine().trim());

        IntStream.range(0, testCases).forEach((i) -> {
            System.out.println(isOnePastPalindrome(scanner.nextLine().trim().toLowerCase()));
        });
    }
}