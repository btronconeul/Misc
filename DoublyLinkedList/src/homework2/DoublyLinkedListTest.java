package homework2;

import junit.framework.Assert;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void test() {

		String projectedReversed = "4 3 2 1 ";
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Assert.assertEquals(projectedReversed, list.printReverse());
		
		String projectedNormal = "Brian Kristi Bradley Riko ";
		DoublyLinkedList list2 = new DoublyLinkedList();
		list2.add("Brian");
		list2.add("Kristi");
		list2.add("Bradley");
		list2.add("Riko");
		
		Assert.assertEquals(projectedNormal, list2.printForward());
		
	}

}
