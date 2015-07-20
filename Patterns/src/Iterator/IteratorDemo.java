package Iterator;

import java.util.Enumeration;

/*Iterator design pattern

 Take traversal-of-a-collection functionality out of the collection and
 promote it to "full object status". This simplifies the collection,
 allows many traversals to be active simultaneously, and 
 decouples collection algorithms from collection data structures.

 Design an internal "iterator" class for the "collection" class
 Add a createIterator() member to the collection class
 Clients ask the collection object to create an iterator object
 Clients use the first(), isDone(), next(), and currentItem() protocol

 Provides a way to access the elements of an aggregate object without
  exposing its underlying representation. 
 * */

public class IteratorDemo {
	public static void main(String[] args) {
		IntSet set = new IntSet();
		for (int i = 2; i < 10; i += 2)
			set.add(i);
		for (int i = 1; i < 9; i++)
			System.out.print(i + "-" + set.isMember(i) + "  ");

		// 3. Clients ask the collection object to create many iterator objects
		IntSet.Iterator it1 = set.createIterator();
		IntSet.Iterator it2 = set.createIterator();

		// 4. Clients use the first(), isDone(), next(), currentItem() protocol
		System.out.print("\nIterator:    ");
		for (it1.first(), it2.first(); !it1.isDone(); it1.next(), it2.next())
			System.out
					.print(it1.currentItem() + " " + it2.currentItem() + "  ");

		// Java uses a different collection traversal "idiom" called Enumeration
		System.out.print("\nEnumeration: ");
		for (Enumeration e = set.getHashtable().keys(); e.hasMoreElements();)
			System.out.print(e.nextElement() + "  ");
		System.out.println();
	}

}
