package practise;

public class randomEx {
    public static void main(String[] args){
        System.out.println(fib(10));
    }
// 0 1 1 2 3 5 8 13 21 34 55
    //fibonacci without recirsion Complexity is O(n)
//    public static int fib(int n){
//        int f0 = 0;
//        int f1 = 1;
//        int f2 = 1;
//        if( n == 0){return f0;}
//        if( n == 1){return f1;}
//        if( n == 2){return f2;}
//        if( n > 2){
//            for(int i = 3; i <= n; i++){
//               f0=f1;
//               f1=f2;
//               f2= f0 + f1;
//            }
//        }
//        return f2;
//    }
public static int fib(int n){
        int result = 0;
        if(n==0){return 0;}
        if(n<= 2){return 1;}
        if(n>2){
            result = fib(n-1) + fib(n-2);

        }
        return result;
}
}
