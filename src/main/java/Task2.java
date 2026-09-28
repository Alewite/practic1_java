import java.util.Scanner;
// вараинт 4 таск 2
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x) + Math.tan(x);
        System.out.println(y);
}

