/*
    1. Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
    Пример 1: а = 3, b = 2, ответ: 9
    Пример 2: а = 2, b = -2, ответ: 0.25
    Пример 3: а = 3, b = 0, ответ: 1
    Пример 4: а = 0, b = 0, ответ: не определено
    Пример 5 входные данные находятся в файле input.txt в виде b 3 a 10
    Результат нужно сохранить в файле output.txt 1000
 */
import java.io.*;
import java.util.Scanner;


public class Task_01 {
    public static void File_Reader() throws Exception{
        File file = new File("src/input_task01.txt");
        if (!file.exists()) {
            System.out.println("файла с исходными данными не существует");
        }else{
            FileReader fr = new FileReader("src/input_task01.txt");
            Scanner scan = new Scanner(fr);
            int a = 0, b = 0;
            while (scan.hasNextLine()) {
                String data_line = scan.nextLine();
                String[] data_file = data_line.split(" ");
                System.out.println(data_file[0]);
                String time_value = data_file[0];
                if (time_value.equals("a")) {
                    a = Integer.parseInt(data_file[1]);
                }else if (time_value.equals("b")) {
                    b = Integer.parseInt(data_file[1]);
                }
            }
            fr.close();
            double result = if_pow(a, b);
            if (a == 0 && b == 0) System.out.printf("Исходные данные a = %d, b = %d. Результат не определен", a, b);
            else System.out.printf("Исходные данные a = %d, b = %d. Результат = " + result, a, b);
            File_Write(a, b, result);
        }
    }

    public static void File_Write(int value, int pow_value, double result) throws Exception {
        FileWriter fw = new FileWriter("src/out_task01.txt");
        fw.write(value + " в степени " + pow_value + " = " + result);
        fw.close();
    }

    public static double pow(int value, int pow_value){
        int result = 1;
        for (int i = 1; i <= pow_value; i++){
            result *= value;
        }
        return result;
    }

    public static double if_pow(int value, int pow_value) {
        if (pow_value > 0) return pow(value, pow_value);
        else if (pow_value < 0) return 1 / pow(value, - pow_value);
        else return 1;
    }

    public static void main(String[] args) throws Exception{
        File_Reader();
    }
}