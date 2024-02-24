/*
Suppose that a variable a is declared as int a = 2147483647 (or equivalently,Integer.MAX_VALUE ). 
What do each of the following print?
*/
public class q3 {
    public static void main(String[] args) {
        int a=2147483647;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(2-a);
        System.out.println(-2-a);
        System.out.println(2*a);
        System.out.println(4*a);
    }
}
/* output:-
   2147483647
  -2147483648
  -2147483645
   2147483647
  -2
  -4
*/
