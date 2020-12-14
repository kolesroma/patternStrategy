public class bubbleSort extends sorting{
	@Override
	public double[] sorting(double[] arr) {
		double[] array = new double[arr.length];
		System.arraycopy(arr, 0, array, 0, arr.length);
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
