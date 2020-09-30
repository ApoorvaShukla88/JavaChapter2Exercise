package chapter20List;

public class practise {
    static String pre = null;
    public static void main(String[] args){
        System.out.println(commonPreffix("mining", "timing"));
    }

    public static String commonPreffix(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return null;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                pre += s1.charAt(i);
            }
        }
        return pre;

    }}


