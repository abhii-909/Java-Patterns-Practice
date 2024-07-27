public class Alphabet_triangle_12 {
    public static void main(String[] args) {
        nLetterTriangle(4);
    }
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A'+ i ; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
