public class Diamond_4 {
    public static void main(String args[]){
        int n = 4;

        // Upper pyramid
        for(int i = 1; i <= n; i++){
            // spaces
            int spaces = n-i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // Lower inverted pyramid
        for(int i = n; i >= 1; i--){
            // spaces
            int spaces = n-i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// Output:-
// 
//    * 
//   * * 
//  * * * 
// * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 