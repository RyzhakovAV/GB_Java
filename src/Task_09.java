import java.util.Arrays;

//Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class Task_09 {

    public void sort(int array[]) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(array, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = array [0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    void heapify(int array[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest]) largest = l;
        if (r < n && array[r] > array[largest]) largest = r;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, n, largest);
        }
    }

    static void printArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int array_numbers[] = new int[20];
        for (int i = 0; i < array_numbers.length; i++){
            array_numbers[i] = ((int) (Math.random() * 201) - 100);
        }
        System.out.println("Массив случайных чисел: ");
        printArray(array_numbers);
        Task_09 ob = new Task_09();
        ob.sort(array_numbers);
        System.out.println("Массив после сортировки: ");
        printArray(array_numbers);
        System.out.println(System.currentTimeMillis() - time);
    }
}
