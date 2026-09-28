import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("программа вычисляет S круга");
        System.out.print("Введите радиус круга:");
        double r = scanner.nextDouble();
        if (r <=0){
            System.out.println("ERROR - радиус должен быть больше 0");
            return;
        }
        double s = Math.PI * Math.pow(r,2);
        System.out.println("S = "+ s);
}
}
