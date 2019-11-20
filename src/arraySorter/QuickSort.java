package arraySorter;

import java.util.Arrays;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public T[] sort(T[] array) {

        System.out.println(Arrays.toString(array));


        if (array[0].compareTo(array[array.length - 1]) < 0) {

            int pi = quickSort(array, 0, array.length - 1);

            quickSort(array, 0, pi-1);
            quickSort(array, pi+1, array.length - 1);

        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    private int quickSort (T[] array, int low, int high) {

        int pivot = array.length - 1;
        int i = low - 1;
        T tmp;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(array[pivot]) < 0) {
                i++;
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        tmp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = tmp;

        return i + 1;
    }
}
