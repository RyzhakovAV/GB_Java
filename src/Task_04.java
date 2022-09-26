//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Task_04 {

    public static void move (int n, char from, char buf, char to) {
        if(n==1)
        {
            System.out.println("Перемещение диска " + n + " с кольца " + from + " на кольцо " + to);
            return;
        }
        move(n-1,from,to,buf);
        System.out.println("Перемещение диска " + n + " с кольца " + from + " на кольцо " + to);
        move(n-1,buf,from,to);
    }

    public static void main (String[] args) {
        int amount_disk = 5;
        move(amount_disk,'A','B','C');
        int count = (int) (Math.pow(2, amount_disk) - 1);
        System.out.printf("\nКоличество ходов: %d", count);
    }
}
