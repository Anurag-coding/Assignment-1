/*
Write a java program to exchange the value of 4 variables W,G,K,A such that the value of 
W will move to A, A to K, K to G and finally G to W. Exchange using with and without 
using extra variables
*/
public class q5 {
    public static void main(String[] args) {
        int W=10,G=20,K=30,A=40;
        System.out.println("Before Swap:");
        System.out.println("W = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);
        System.out.println("");
        // swapping W and G variables
        W = W + G;
        G = W - G;
        W = W - G;
        // swapping G and K variables
        G = G + K;
        K = G - K;
        G = G - K;
        // swapping K and A variables
        K = K + A;
        A = K - A;
        K = K - A;
        System.out.println("After Swap:");
        System.out.println("W = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);
    }
}
/* output:-
   Before Swap:
   W = 10
   G = 20
   K = 30
   A = 40
   
   After Swap:
   W = 20
   G = 30
   K = 40
   A = 10
*/

