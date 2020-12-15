public class insertionSort implements Strategy{
	@Override
	public double[] sorting(double[] arr) {
	double[] array = Default.arrayDuplicator(arr);
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
