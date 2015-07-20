package removeDuplicates;
import static org.junit.Assert.assertArrayEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class removeDuplicatesTest {	

		private removeDuplicates r; //  = new RemoveElement();
		
		@Before
		public void init() {
			System.out.println("Before");
			r = new removeDuplicates();
		}

		@After
		public void teardown() {
			System.out.println("nothing to teardown");
		}
		
		@Test
		public void testRemoveASingleElem() {
			int[] arr = new int[] { 1, 2, 1, 3, 1, 5 };
			int[] resultArr = r.removeduplicates(arr);
			
			assertArrayEquals(new int[] { 1 , 2 , 1 , 3 , 1 , 5 },  resultArr);
		
		}

		
		@Test
		public void testRemoveASingleElem1() {
			int[] arr = new int[] { 1, 2, 1, 1, 3, 1, 5 };
			int[] resultArr = r.removeduplicates(arr);
			
			assertArrayEquals(new int[] {1 ,2, 1, 3, 1, 5, 0 },  resultArr);
		}

		@Test
		public void testRemoveAbsentElem() {
			int[] arr = new int[] { 1, 2, 1, 3, 1, 5 };
			int[] resultArr = r.removeduplicates(arr);
			
			assertArrayEquals(new int[] { 1, 2, 1, 3, 1, 5 },  resultArr);
		}
		
		@Test
		public void testRemovalOnEmptyArr() {
			int[] arr = new int[0]; // { 1, 2, 1, 3, 1, 5 };
			int[] resultArr = r.removeduplicates( arr);
			
			assertArrayEquals(new int[0],  resultArr);
		}
		
		
	
}
