/*
Suppose that a variable a is declared as double a=3.14159.What do each of the following print?
 */
public class q4 {
    public static void main(String[] args) {
        double a=3.14159;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(8/(int)a);
        System.out.println(8/a);
        System.out.println((int)(8/a));
    }
}
/* output:-
   3.14159
   4.14159
   2
   2.5464812403910124
   2
*/
