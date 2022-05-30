package Prometheus.tasks4;

public class Sort {
	private static void sort(int[] array, Comparator comp) {
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int val = array[i];
				int j;
				for (j = i; j >= gap && comp.compare(array[j - gap], val) > 0; j -= gap) {
					array[j] = array[j - gap];
				}
				array[j] = val;
			}
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,2,4,10,6,0,3,10};

// Overriding method compare to change sort order

		Comparator comp = new Comparator() {
			@Override
			public int compare(int b, int a){
				return (a > b) ? 1 : (a < b) ? -1 : 0;
			}
		};
		sort(array, comp);

		for (int j : array) {
			System.out.print(j + " ");
		}
	}
}
