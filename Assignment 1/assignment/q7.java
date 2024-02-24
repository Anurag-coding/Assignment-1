/*
Write a java program to exchange the values of two variables of integer type X and Y 
using third temporary variable Z. 
 */
public class q7{
    public static void main(String[] args){
        int X=10,Y=20,Z;
        System.out.println("Before exchange");
        System.out.println("X="+X);
        System.out.println("Y="+Y);
        Z=X;
        X=Y;
        Y=Z;
        System.out.println("After exchange");
        System.out.println("X="+X);
        System.out.println("Y="+Y);
    }
}
/*output:-
  Before exchange
  X=10
  Y=20
  After exchange
  X=20
  Y=10  
*/

    

