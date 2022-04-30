import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, r;
        int nTotal = 1, rTotal = 1, total = 1;
        int combination = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("N degerini girin:");
        n = scanner.nextInt();

        System.out.print("R degerini girin:");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            nTotal = nTotal * i;
            if (n > r) {
                System.out.println("r degeri n degerinden buyuk olamaz.");
                break;
            }

        }

        for (int j = 1; j <= r; j++) {
            rTotal = rTotal * j;
        }

        for (int k = 1; k <= n - r; k++) {
            total = total * k;
        }

        combination = nTotal / (rTotal * total);

        System.out.println("Kombinasyon degeri : " + combination);


    }
}
