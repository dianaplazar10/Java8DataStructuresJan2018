package com.string;
// Java program to print all permutations of a
// given string.
public class AllPermutationsOfString//works for witrh duplicates ALSO 
{
    public static void main(String[] args)
    {
        String str = "AAC";
        int n = str.length();
        AllPermutationsOfString permutation = new AllPermutationsOfString();
        permutation.permute(str, 0, n-1);
    }
 
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int firstIndex, int lastIndex)
    {
        if (firstIndex == lastIndex)
            System.out.println(str);
        else
        {
            for (int i = firstIndex; i <= lastIndex; i++)
            {
                str = swap(str,firstIndex,i);
                permute(str, firstIndex+1, lastIndex);
                str = swap(str,firstIndex,i);
            }
        }
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}