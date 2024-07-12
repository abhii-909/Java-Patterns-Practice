import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for (int  i = 1; i <= n; i++){
            //inner loop 1 -> space print
            for (int j =  1; j <= n-i; j++){
                System.out.print(" ");
            }

            //inner loop 2 -> star print
            for( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
            in.close();
        }
    }
}


// Output :
// Enter n: 4
//    * 
//   * * 
//  * * * 
// * * * * 