public class selectionSort extends sorting{
	@Override
	public double[] sorting(double[] arr) {
		double[] array = new double[arr.length];
		System.arraycopy(arr, 0, array, 0, arr.length);
		for (int i = 1; i < array.length; i++) {
			int min_idx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min_idx] > array[j]) {
					min_idx = j;
				}
			}
			double temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
