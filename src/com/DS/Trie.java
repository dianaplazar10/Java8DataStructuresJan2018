//refer :https://www.geeksforgeeks.org/trie-insert-and-search/

package com.datastructures;
// Java implementation of search and insert operations
// on Trie
public class Trie {
     
    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;
     
    // trie node
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
      
        // isEndOfWord is true if the node represents end of a word
        boolean isEndOfWord;
        char letter;
         
        TrieNode(char letter){
            isEndOfWord = false;
            this.letter=letter;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
      
    static TrieNode root; 
     
    // If not present, inserts key into trie
    // If the key is prefix of trie node, 
    // just marks leaf node
    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        TrieNode pCrawl = root;
        
        System.out.println("---------pCrawl.letter-------------"+pCrawl.letter);
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode(key.charAt(level));
      
            pCrawl = pCrawl.children[index];
            System.out.println("---------new Root-------------"+pCrawl.letter);
        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }
      
    // Returns true if key presents in trie, else false
    static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return false;
      
            pCrawl = pCrawl.children[index];
        }
      
        return (pCrawl != null && pCrawl.isEndOfWord);
    }
      
    // Driver
    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
      
        String output[] = {"Not present in trie", "Present in trie"};
      
        root = new TrieNode('R');
        System.out.println("---------------------ROOT : " + root.letter);
        // Construct trie
        for (int i = 0; i < keys.length ; i++)
            insert(keys[i]);
      
        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
         
        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
         
        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
         
        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
        
    }
}
// This code is contributed by Sumit Ghosh