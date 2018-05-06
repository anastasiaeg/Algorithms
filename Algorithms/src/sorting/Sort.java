package sorting;

import java.util.Arrays;

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
	
	/**
	 * Sorts using merge sort algorithm. 
	 * {9}, {8}, {7}, {6}, {5}, {4}, {3}, {2}, {1}
	 * {8, 9}, {6, 7}, {4, 5}, {2, 3}, {1}
	 * {6, 7, 8, 9}, {2, 3, 4, 5}, {1}
	 * {2, 3, 4, 5, 6, 7, 8, 9}, {1}
	 * {1, 2, 3, 4, 5, 6, 7, 8, 9}
	 * @param array
	 * @return
	 */
	public T[] mergeSort(T[] array) {
		return merge(array);
	}
	
	private T[] merge(T[] array) {
		if (array.length <= 1) {
			return array;
		}
		if (array.length / 2 == 0) return array;
		T[] left = Arrays.copyOfRange(array, 0, array.length / 2);
		T[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
		left = merge(left);
		right = merge(right);
		return compare(left, right);
	}
	
	private T[] compare(T[] left, T[] right) {
		int i = 0, j = 0, index = 0;
		T[] output = Arrays.copyOf(left, left.length + right.length);
		while (i < left.length || j < right.length) {
			if (j < right.length && (i >= left.length || left[i].compareTo(right[j]) > 0)) {
				output[index++] = right[j++];
			} else {
				output[index++] = left[i++];
			}
		}
		left = null; right = null;
		return output;
	}
}
