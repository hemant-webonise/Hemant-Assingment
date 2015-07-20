package removeDuplicates;

public class Demo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			removeDuplicates array = new removeDuplicates();
			/*Input array will be introduced here*/
			int[] arr = new int[] { 1, 2, 1, 3, 1, 5};
			
			array.removeduplicates(arr);
			int total = arr.length;
			diplayer(arr, total);
			
		}
        /*Displayer Method*/
		private static void diplayer(int[] arr, int total) {
			for(int i=0 ; i<(total);i++)
			System.out.print(" " + arr[i] + " ");
		}

	

}
