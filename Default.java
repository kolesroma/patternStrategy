public class Default {
	public static void main(String[] args) {
		double[] arr = new double[] {1.6, 4.2, 6.6, 2.1, 3.5, 9.3, 8.7, 10.1, 7.9, 5.2 };
		printArray(arr); // ���������� �����
		
		sorting inserS = new insertionSort();
		sorting selecS = new selectionSort();
		sorting bubblS = new bubbleSort();
		printArray(inserS.sorting(arr)); // ������������ ����� insertionSort
		printArray(selecS.sorting(arr)); // ������������ ����� selectionSort
		printArray(bubblS.sorting(arr)); // ������������ ����� bubbleSort
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
}