Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
 
SOLUTION 1:

class Solution {
    public boolean canConstruct(String ransomnote, String magazine) {
        for(int i=0;i<ransomnote.length();i++){
            char r=ransomnote.charAt(i);
            
            int match=magazine.indexOf(r);
            
            if(match==-1){
                return false;
            }
            magazine=magazine.substring(0,match)+magazine.substring(match+1);
        }
        return true;
    }
}


SOLUTION 2: HASHMAP

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> count=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char m=magazine.charAt(i);
            int c=count.getOrDefault(m,0);
            count.put(m,c+1);
        }
        for(int j=0;j<ransomNote.length();j++){
            char r=ransomNote.charAt(j);
            int c=count.getOrDefault(r,0);
            if(c==0){
                return false;
            }
            count.put(r,c-1);
        }
        return true;
    }
}
