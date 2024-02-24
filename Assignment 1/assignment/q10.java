/*
Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java 
program to print the following output using string concatenation. (You can take extra string 
variables)
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
*/
public class q10{
    public static void main(String[] args){
        String x="1";
        System.out.println(x);
        x=x+" 2 "+x;
        System.out.println(x);
        x=x+" 3 "+x;
        System.out.println(x);
        x=x+" 4 "+x;
        System.out.println(x);
    }
}
