package company.com;

public class Recursion {
    public static void main(String[] args) {
        int row = 4;
        int i = 0;
        star(row, i);

    }

    static void star(int n, int i) {
        if (n == 0) {
            return;
        } else if (i < n) {
            System.out.print("*");
            star(n, i + 1);


        } else {
            System.out.println();
            star(n - 1, i = 0);
        }

    }

}
