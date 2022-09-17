    1. Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.

    Пример 1: а = 3, b = 2, ответ: 9
    Пример 2: а = 2, b = -2, ответ: 0.25
    Пример 3: а = 3, b = 0, ответ: 1
    Пример 4: а = 0, b = 0, ответ: не определено
    Пример 5 входные данные находятся в файле input.txt в виде b 3 a 10 Результат нужно сохранить в файле output.txt 1000

    2. На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды

    команда 1 (к1): увеличить в с раза, а умножается на c
    команда 2 (к2): увеличить на d, к a прибавляется d

    написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно Пример 1: а = 1, b = 7, c = 2, d = 1 ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 Можно начать с более простого – просто подсчёта общего количесвтва вариантов Пример 2: а = 11, b = 7, c = 2, d = 1 ответ: нет решения.
    Подумать над тем, как сделать минимальное количество команд

    3. Написать программу вычисления n-ого треугольного числа

    4. Написать программу, показывающую последовательность действий для игры “Ханойская башня”

    5. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69

    Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

    6. Реализовать алгоритм сортировки слиянием

    7. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

    8. Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

    Пример для доски 5х5 решение может выглядеть так

25 	14 	3 	8 	19
4 	9 	18 	13 	2
15 	24 	1 	20 	7
10 	5 	22 	17 	12
23 	16 	11 	6 	21

    9. Реализовать алгоритм пирамидальной сортировки (HeapSort)

    10. Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.

    http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
    Вычислить запись если это возможно

    11. Реализовать волновой алгоритм

    12. Написать программу, определяющую правильность расстановки скобок в выражении.

    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь

    13. Написать программу вычисляющую значение сложного арифметического выражения. Для простоты - выражение всегда вычисляемое

    Пример: (2^3 * (10 / (5 - 3)))^(Sin(Pi)) ответ - 1
