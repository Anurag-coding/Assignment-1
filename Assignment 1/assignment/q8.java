/*
 Write a java program to exchange the values of two variables of integer type X and Y without 
 using third temporary variable.
 */
public class q8 {
    public static void main(String[] args){
        int X=10,Y=20;
        System.out.println("Before exchange");
        System.out.println("X="+X);
        System.out.println("Y="+Y);
        X=X+Y;
        Y=X-Y;
        X=X-Y;
        System.out.println("After exchange");
        System.out.println("X="+X);
        System.out.println("Y="+Y);
    }
}
/* output:-
   Before exchange
   X=10
   Y=20
   After exchange
   X=20
   Y=10
*/
