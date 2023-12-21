public class Has5 {
    public static void main(String[] args) {
        int W=10;int G=20;int K=30;int A=40;
        System.out.println("before exchange");
        System.out.println("W="+W);
        System.out.println("G="+G);
        System.out.println("K="+K);
        System.out.println("A="+A);
        W=W+G+K+A;
        G=W-(G+K+A);
        K=W-(G+K+A);
        A=W-(G+K+A);
        W=W-(G+K+A);
        System.out.println("After exchange");
        System.out.println("W="+W);
        System.out.println("G="+G);
        System.out.println("K="+K);
        System.out.println("A="+A);        
    }
    
}
