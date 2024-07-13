public class Pascal_Triangle_7 {
    public static void main(String args[]){
        int n = 5;

        for(int i = 0; i <= n; i++){
            // spaces
            int spaces = n-i;
            for(int j = 0; j <= spaces; j++){
                System.out.print(" ");
            }

            // numbers
            int number = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}


// Output:-
// 
//       1 
//      1 1 
//     1 2 1 
//    1 3 3 1 
//   1 4 6 4 1 
//  1 5 10 10 5 1 