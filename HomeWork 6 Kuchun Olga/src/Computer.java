import java.util.Random;
import java.util.Scanner;

public class Computer {
    String CPU;
    int RAM;
    int HDD;
    int resource;

    public Computer(String CPU, int RAM, int HDD, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resource = resource;
    }
// Способ 1. Включение и выключение в одном методе.
    public void turnOn(int tresource) {
        Random random = new Random();
        System.out.println("Введите 1 или 0 ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < resource; i++) {
            int n = random.nextInt(2);
            //  System.out.println(n);
            int a = scanner.nextInt();
            if (a == 0 || a == 1) {
                if (a == n) {
                    System.out.println("Комп включился");
                }
                if (a != n) {
                    System.out.println("Комп сгорел(");
                    break;
                }
            } else {
                System.out.println("Введите 0 или 1");
                a = scanner.nextInt();
            }
            int n1 = random.nextInt(2);
            // System.out.println(n1);
            int b = scanner.nextInt();
            if (b == 0 || b == 1) {
                if (b == n1) {
                    System.out.println("Комп выключился");
                }
                if (b != n1) {
                    System.out.println("Комп сгорел(");
                    break;
                }
            } else {
                System.out.println("Введите 0 или 1");
                b = scanner.nextInt();
            }

        }
    }
// Способ два включение и выключение в двух методах.
    public boolean turnOn1() {
        boolean b = false;
        Random random = new Random();
        System.out.println("Введите 1 или 0 ");
        Scanner scanner = new Scanner(System.in);
        int n = random.nextInt(2);
        System.out.println(n);
        int a = scanner.nextInt();
        while (a == 0 || a == 1) {
            if (a == n) {
                System.out.println("Комп включился");
                b = true;
                break;
            } else if (a != n) {
                System.out.println("Комп сгорел(");
               b = false;
                break;
            }
        }
        return b;
    }

    public boolean turnOff() {
        boolean c = true;
        Random random = new Random();
        System.out.println("Введите 1 или 0 ");
        Scanner scanner = new Scanner(System.in);
        int n1 = random.nextInt(2);
        System.out.println(n1);
        int b = scanner.nextInt();
        while (b == 0 || b == 1) {
            if (b == n1) {
                System.out.println("Комп выключился");
                c = true ;
                break;
            }
            if (b != n1) {
                System.out.println("Комп сгорел(");
                c = false;
                break;
            }
        }
        return  c;
    }
}
