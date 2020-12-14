public class insertionSort extends sorting{
	@Override
	public double[] sorting(double[] arr) {
		double[] array = new double[arr.length];
		System.arraycopy(arr, 0, array, 0, arr.length);
		for (int i = 1; i < array.length; i++) {
			double current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
				array[j + 1] = current;
			}
		}
		return array;
	}

}
