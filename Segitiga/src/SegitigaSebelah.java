
import java.util.Scanner;

public class SegitigaSebelah {
    public static void main (String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        n = input.nextInt();

        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                // Bagian pertama (pola menurun)
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else if (i==n) {
                continue;
            } else {
                // Bagian kedua (pola menaik)
                for (int j = 0; j < n * 2 - i  ; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
            //test
            //test
        }
    }
}
