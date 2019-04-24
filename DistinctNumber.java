import java.util.Arrays;

public class DistinctNumber {
	public static void main (String [] args) {
		int[] numbers = new int[10];
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter ten integers: ");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int[] result = eliminateDuplicates(numbers);
		System.out.println("The distinct array presents " + Arrays.toString(result));
	}
	
	public static int linearSearch(int[] list, int key) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == key){
				return i;
			}
		}
		return -1;
	}
	
	public static int[] eliminateDuplicates(int[] numbers) {
		int [] arr = new int[numbers.length];
		int index = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(linearSearch(arr, numbers[i]) == -1) {
				arr[index] = numbers[i];
				index++;
			}
		}
		
		int[] result = new int[index];
		for(int i = 0; i < index; i++) {
			result[i] = arr[i];
		}
		
		return result;
	}

}
