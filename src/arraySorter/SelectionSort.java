package arraySorter;

/**
 * author Salvatore Tarantino, u1860830
 * u1860830@hud.ac.uk
 */

public class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {

    /**
     * An implementation of the Selection Sort algorithm.
     *
     * @param array the array to be sorted
     * @return the sorted array
     */

    public T[] sort(T[] array) {



        for (int i = 0; i < (array.length - 1); i++) {

            int min = i;

            for (int j = (i + 1); j < array.length; j++) {

                if (array[j].compareTo(array[min]) < 0)
                    min = j;
            }

            T tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
