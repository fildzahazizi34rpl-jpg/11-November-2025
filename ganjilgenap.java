import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan bilangan");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}