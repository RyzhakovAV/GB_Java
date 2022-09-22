import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_03 {

    public static int triangle(int number) {
        return ((number + 1) * number ) / 2;
    }

    static public void main (String[] args) {
        try (Scanner console = new Scanner(System.in)){
            System.out.print("Введите число n для нахождения n-го треугольника числа --> ");
            int n = console.nextInt();
            if (n <= 0) {
                System.out.println("Число должно быть больше 0");
            }else{
                    System.out.printf("%d-е треугольное число - %d\n", n, triangle(n));
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Невернный ввод");
        }
    }
}
