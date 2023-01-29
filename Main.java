import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    static void asal() {
        Scanner input = new Scanner(in);
        int a;
        out.print("Sayıyı giriniz : ");
        a = input.nextInt();
        
        boolean b = false;
        if (a == 2) {
            b = false;
        } else if (a % 2 == 0) {
            b = true;
        } else if (a % 3 == 0) {
            b = true;
        } else if (a % 5 == 0) {
            b = true;
        } else if (a % 7 == 0) {
            b = true;
        }
        for (int i = 1; i <= 7; i += 2) {
            if (a == i) {
                b = false;
                break;
            }
        }
        if (b == false) out.println(a + " sayıyı Asaldır.");
        else out.println(a + " sayısı Asal değildir.!");
        asal();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.println("Asal sayı bulan program.");
        asal();

    }
}
