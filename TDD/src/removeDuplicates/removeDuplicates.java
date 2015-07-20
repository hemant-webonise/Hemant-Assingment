package removeDuplicates;

public class removeDuplicates {
	public int[] removeduplicates(int[] arr) {
		int i,j;
		j=arr.length -1;
		i = j-1;
		while(i >= 0 ){
			if(arr[i] == arr[j]){
				int k =j;
				k = shifter(arr, k);
				arr[k] = 0;
			}
			else {
				j=i;
				i= i-1;
			}
		}
		return arr;
	}

	private int shifter(int[] arr, int k) {
		while(k<arr.length -1){
			arr[k] = arr[k+1];
			k++;
		}
		return k;
	}
}
