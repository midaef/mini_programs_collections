
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
	    Scanner  s = new Scanner(System.in);
		int[] arr = {5, 4, 7, 1, 7};
		for (int i = arr.length - 1; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
		System.out.println(Arrays.toString(arr));
				}
			}
		}
    }
}
