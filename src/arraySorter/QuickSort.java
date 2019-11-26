package arraySorter;

import java.util.Arrays;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public T[] sort(T[] array) {

        System.out.println(Arrays.toString(array));
        int pi = quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        return array;

    }

    private int quickSort (T[] array, int low, int high) {

        int pivot = high;
        int i = low;
        T tmp;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(array[pivot]) < 0) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
            }
        }
        tmp = array[i];
        array[i] = array[high];
        array[high] = tmp;

        return i;
    }
}
