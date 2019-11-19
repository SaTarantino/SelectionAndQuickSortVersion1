package arraySorter;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public T[] sort(T[] array) {

    }

    private void partition (T array[], T left, T right) {

//        T i = array[0];
//        T j = array[array.length -1];
//        T tmp;
//        T pivot = j;
//
//        while (i != j) {
//            while (j != pivot){
//                array[i] = array[i+1];
//            }
//        }

//        while (i <= j) {
//            while (array[j].compareTo(array[pivot]) < 0) i++;
//            while (array[j].compareTo(array[pivot]) > 0) j--;
//            if (i <= j) {
//                tmp = (int) array[i];
//                array[i] = array[j];
//                array[j] = tmp;
//                i++;
//                j--;
//            }
//        }
//        return i;

    }
}
