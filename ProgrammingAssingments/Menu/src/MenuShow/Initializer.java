package MenuShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Initializer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = args[0];
		
		List<String> items = new ArrayList();
		for (int counter = 1; counter < args.length; counter++) {
			items.add(args[counter]);
		}
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.println("Args[" + i + "] : " + args[i]);
		}
	
		Map<Integer, Map<String, Double>> outerMap;

		MenuFilePuller Loader = new MenuFilePuller();
		
		outerMap = Loader.Pull(a);
        System.out.println("\n");
		int BestRestorant = Loader.getBestDeal(outerMap, items);
		if (BestRestorant == -1) {
			if (items.size() > 1) {
				System.out
				.println("The combintation is not present in one Restorant.");
			} else {
				System.out
				.println("The food item Listed is not present in restorants.");
			}
		} else {
			System.out.println("Conclusion - \nThe Best restorant is : " + BestRestorant+" To eat " + items);
		}
		System.out.println("The price is : $"+Loader.getMinimumCost());

	}

}
