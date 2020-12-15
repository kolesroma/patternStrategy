public class bubbleSort implements Strategy{
	@Override
	public double[] sorting(double[] arr) {
		double[] array = Default.arrayDuplicator(arr);
		//
		for (int k = 1; k < array.length; k++)
			for (int i = 1; i < array.length + 1 - k; i++) {
				if (array[i - 1] > array[i]) {
					double temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;							
				}
			}
		//
		return array;
	}

}
