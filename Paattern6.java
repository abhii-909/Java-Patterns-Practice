import java.util.Scanner;

public class Paattern6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j =1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        in.close();
    }
}



// Output:
// Enter n: 5
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5