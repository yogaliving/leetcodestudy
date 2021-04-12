package practice.hash;

public class canConstruct1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] arr = new int[26];
        if (ransomNote.length() > magazine.length()) return false;
        for (int i = 0; i < magazine.length(); i++) {
            if (i<=ransomNote.length())
            arr[ransomNote.charAt(i)-'a'] ++;
            arr[magazine.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i]>0) return false;
        }
        return true;
    }
}
