package sorting;

public class Sort<T extends Comparable<T>> {
	public T[] bubbleSort(T[] array) {
		int current = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < current; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
