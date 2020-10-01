package chapter20List;

//import static jdk.nashorn.internal.objects.NativeString.charAt;

public class fibnacci {
    public static void main(String[] args){
 //       System.out.println(fib(7));
//        System.out.println(isPalindrome("moon"));
        StringBuilder st = new StringBuilder();
        st.append("Welcome");
        st.append("Apoorva");
        st.insert(1, "Joy");
        System.out.println(st);
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);

    }

    public static boolean isPalindrome(String s){
//        if(s.charAt(0) == s.charAt(s.length()-1)) return true;
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--){
            temp += s.charAt(i);
        }
        System.out.println(temp);
        if(temp.equals(s)){
            return true;
        }else return false;

    }



}
