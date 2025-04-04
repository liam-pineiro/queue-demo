package classAssignments;

import priorityQueue.ArrayQueue;
import java.util.*;

public class QueueDemo<T> {

	private ArrayQueue<T> items;
	private ArrayList<T> itemsCopy = new ArrayList<>();

	public QueueDemo() {
		items = new ArrayQueue(3);
	}
	
	public void push(T item) {
		if(items.size() < 3) {
			items.add(item);
			itemsCopy.add(item);
			System.out.println("Element " + item + " is pushed to Queue!");
			System.out.println("Elements in Queue: ");
			for(int i = 0; i < itemsCopy.size(); i++) {
				if(itemsCopy.get(i) != null) {
					System.out.println(itemsCopy.get(i));
				}
			}
			
		}
		else {
			System.out.println("Overflow!");
		}
    }
	
	public void pop() {
		if(!items.isEmpty()) {
			System.out.println("Pop operation done!");
			items.remove();
			itemsCopy.remove(itemsCopy.get(0));
			if(!items.isEmpty()) {
				System.out.println("Elements in Queue: ");
				for(int i = 0; i < itemsCopy.size(); i++) {
					if(itemsCopy.get(i) != null) {
						System.out.println(itemsCopy.get(i));
					}
				}
			}
		}
		else {
			System.out.println("Underflow!");
		}
	}
}
