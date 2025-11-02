import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

//задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

//задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

//задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

//задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

//задача 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

//задача 8
        int cash;
        for (int i = 1; i <= 12; i++) {
            cash = 29000 * i;
            System.out.println("Месяц " + i + ", сумма накполений равна " + cash + " рублей");
        }

//задача 9
        double cash2 = 0;
        for (int i = 1; i <= 12; i++) {
            cash2 = (cash2 + 29000) * 1.01;
            String formatCash2 = new DecimalFormat("0.00").format(cash2);
            System.out.println("Месяц " + i + ", сумма накполений равна " + formatCash2 + " рублей");
        }

//задача 10
        for (int i = 1; i <= 10; i++) {
            int m = i * 2;
            System.out.println("2*" + i + "=" + m);
        }

    }
}