/*
 * Prints a Multiplication Table
 */
public class Mul {

    public static void main(String[] args){
        System.out.println("Multiplication Table");
        int n = Integer.parseInt(args[0]);
        for(int i = 1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
    
}
