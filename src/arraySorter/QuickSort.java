package arraySorter;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public T[] sort(T[] array) {

        quickSort(array, 0, array.length - 1);
        return array;
    }

    private int partition(T[] array, int low, int high) {

        T tmp = array[low];
        int pivot = (low + high) / 2;

        if ((array[low].compareTo(array[pivot]) <= 0 && array[pivot].compareTo(array[high]) <= 0) ||
                (array[high].compareTo(array[pivot]) <= 0 && array[pivot].compareTo(array[low]) <= 0))
            tmp = array[pivot];

        if ((array[low].compareTo(array[high]) <= 0) && array[high].compareTo(array[pivot]) <= 0 ||
                (array[pivot].compareTo(array[high])) <= 0 && array[high].compareTo(array[low]) <= 0)
            tmp = array[high];

        int i = low - 1;
        int j = high + 1;

        while (true) {
            do i++; while (!(i > high || array[i].compareTo(tmp) >= 0));
            do j--; while (!(j < low || array[j].compareTo(tmp) <= 0));
            if (i < j) swap(array, i, j);
            else return j;
        }
    }

    private void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot);
            quickSort(array, pivot + 1, high);
        }
    }

    private void swap(T[] array, int i, int j) {
        T x;
        x = array[i];
        array[i] = array[j];
        array[j] = x;
    }
}
