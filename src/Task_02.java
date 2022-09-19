/*
2. На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
команда 1 (к1): увеличить в с раза, а умножается на c
команда 2 (к2): увеличить на d, к a прибавляется d
написать программу, которая выдаёт набор команд,
позволяющий число a превратить в число b или сообщить, что это невозможно
Пример 1:
а = 1, b = 7, c = 2, d = 1
ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2
Можно начать с более простого – просто подсчёта общего количесвтва вариантов
Пример 2: а = 11, b = 7, c = 2, d = 1 ответ: нет решения.
Подумать над тем, как сделать минимальное количество команд
Решить задачу с маршрутами через рекурсию
 */

import java.util.ArrayList;

public class Task_02 {
    static ArrayList<String> arrayway = new ArrayList<String>();
    public static int[] CountWay(int a, int b, int c, int d, int[] array) {
        if(a > b) {
            return array;
        }else{
            if (a % d == 0) array[a] = array[a - c] + array[a / d];
            else array[a] = array[a - c];
            return CountWay(a+1, b, c, d, array);
        }
    }

    public static void FindWay(int a, int b, int c, int d, String way){
        String k1 = " *" + c;
        String k2 = " +" + d;
        if (a == b) {
            arrayway.add(way);
            return;
        }else if (a > b){
            return;
        }else{
            FindWay(a * c, b, c, d, way + k1);
            FindWay(a + d, b, c, d, way + k2);
        }
    }

    public static String MinWay(ArrayList<String> arr) {
        String minWay = arr.get(0);
        for (String elem : arr) {
            if (elem.length() < minWay.length()) minWay = elem;
        }
        return minWay;
    }

    public static void main(String[] args) {
        int a = 6, b = 78, c = 3, d = 5;
        int[] arr = new int[b + 1];
        arr[a] = 1;
        int[] result = CountWay(a+1, b, c, d, arr);
        FindWay(a, b, c, d, "");

        if (result[b] != 0) {
            System.out.printf("Существует %d путей из %d в %d\n", result[b], a, b);
            StringBuilder strOut = new StringBuilder();
            strOut.append("Все доступные маршруты:\n\n");
            for (String elem : arrayway) {
                strOut.append(elem);
                strOut.append("\n");
            }
            strOut.append("\n");
            strOut.append("Самый быстрый маршрут:\n\n");
            strOut.append(MinWay(arrayway));
            System.out.println(strOut);
        } else {
            System.out.printf("Не существует путей из %d в %d", a, b);
        }
    }
}
