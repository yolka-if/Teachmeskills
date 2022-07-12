import java.util.Scanner;

public class MenuCalcul {
    Division division = new Division();
    Multiplication multiplication = new Multiplication();
    Subtract subtract = new Subtract();
    Sum sum = new Sum();
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    public void calculator() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите математическую операцию");
        String c = scanner.nextLine();
            while (!c.equals("+")&&!c.equals("/")&&!c.equals("-")&&!c.equals("+")&&!c.equals("*")) {
                System.out.println("Такой математической операции нет!");
                c = scanner.nextLine();
            }
            int a=0;
        do {
            System.out.println("Введите первое число!");
            while (!scanner1.hasNextInt()) {
                System.out.println("Это не число!");
                scanner1.next();
            }
            a = scanner1.nextInt();
        } while (a <= 0);

        int b=0;
        do {
            System.out.println("Введите второе число!");
            while (!scanner1.hasNextInt()) {
                System.out.println("Это не число!");
                scanner1.next();
            }
            b = scanner1.nextInt();
        } while (b <= 0);
        switch (c) {
            case ("+"):
                System.out.println("Результат: ");
                sum.Action(a, b);
                break;
            case ("-"):
                System.out.println("Результат: ");
                subtract.Action(a, b);
                break;
            case ("*"):
                System.out.println("Результат: ");
                multiplication.Action(a, b);
                break;
            case ("/"):
                System.out.println("Результат: ");
                division.Action(a, b);
                break;
        }

    }

    public void calculatorMenu() {
        System.out.println("Введите 1 чтобы прейти к вычеслениям,чтобы выйти введите 0.");
        int d = scanner.nextInt();
        while (d == 1) {
            calculator();
            System.out.println("Введите 1 чтобы прейти к вычеслениям,чтобы выйти введите 0.");
            d = scanner.nextInt();
            }
            if (d == 0) {
                System.out.println("Спасибо за использование!");
            }
        }
    }

