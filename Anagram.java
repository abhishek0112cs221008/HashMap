import java.util.*;

class Solution {
    private HashMap<Character, Integer> makeMap(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(!mpp.containsKey(s.charAt(i))) {
                mpp.put(s.charAt(i), 1);
            }
            else {
                int currVal = mpp.get(s.charAt(i));
                mpp.put(s.charAt(i), currVal+1);
            }
        }
        return mpp;
    } 

    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }   
        
        HashMap<Character, Integer> smp = makeMap(s);
        
        for(int i=0; i<t.length(); i++) {
            Character ch = t.charAt(i);

            if(!smp.containsKey(ch)) return false;

            int currfreq = smp.get(ch);
            smp.put(ch, currfreq-1);
        }

        for(var v : smp.values()) {
            if(v != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }   
        
        HashMap<Character, Integer> smp = makeMap(s);
        HashMap<Character, Integer> tmp = makeMap(t);

        return smp.equals(tmp);
    }
}

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        //...
    }
}