/*
 * 2.Tries for Prefix Checking
 	Implement a Tries data structure that supports insertion of strings and 
 	provides a method to check if a given string is a prefix of any word in the 
 	Tries.	
 */

package Day5;

public class TrieStringSearching {
	private TrieStringSearching[] children;
    private boolean isEndOfWord;

    public TrieStringSearching() {
        this.children = new TrieStringSearching[26];
        this.isEndOfWord = false;
    }

    // Insert a word
    public void insert(String word) {
        TrieStringSearching current = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieStringSearching();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    // Check if a word exists in the Trie
    public boolean search(String word) {
        TrieStringSearching current = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord; // Return true only if it's a complete word
    }

    public static void main(String[] args) {
        TrieStringSearching t = new TrieStringSearching();
        t.insert("apple");
        t.insert("banana");
        t.insert("mango");
        t.insert("apply");
        //t.insert("app");
        System.out.println(t.search("apple"));   // true
        System.out.println(t.search("app"));     // false

    }

}
