package may2020;

/* TRIE NODE STRUCTURE */

class TrieNode {
    private TrieNode[] links;
    private final int R = 26;
    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }
    public boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }
    public TrieNode get(char ch) {
        return links[ch -'a'];
    }
    public void put(char ch, TrieNode node) {
        links[ch -'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}

/* TRIE IMPLEMENTATION */

class Trie {
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            if(!node.containsKey(curr)){
                node.put(curr, new TrieNode());
            }
            node = node.get(curr);
        }
        node.setEnd();
    }
    
    /*Common method for Search & Prefix Search*/
    private TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            if(node.containsKey(curr)){
                node = node.get(curr);
            }else{
                return null;
            }
        }
        return node;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd(); //End should be true
    }
    
/** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null; //no need to check end
    }
}