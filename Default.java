public class Default {
	public static void main(String[] args) {
		double[] arr = new double[] {1.6, 4.2, 6.6, 2.1, 3.5, 9.3, 8.7, 10.1, 7.9, 5.2 };
		printArray(arr); // input array
		
		Strategy inserS = new insertionSort();
		Strategy selecS = new selectionSort();
		Strategy bubblS = new bubbleSort();
		printArray(inserS.sorting(arr)); // sorted array with insertionSort
		printArray(selecS.sorting(arr)); // sorted array with selectionSort
		printArray(bubblS.sorting(arr)); // sorted array with bubbleSort
	}
	
	static void printArray(double[] arr) {
		for (double v : arr) {
			if(v == arr[arr.length - 1]){
				System.out.print(v + ";");
				break;
			}
			System.out.print(v + ", ");
		}
		System.out.println("\n");
	}
	
	static double[] arrayDuplicator(double[] arr) {
		double[] array = new double[arr.length];
		System.arraycopy(arr, 0, array, 0, arr.length);
		return array;
	}
}