package datastr;

public class MyLinkedList<T> {
	private Node<T> first = null;
	private Node<T> last = null;
	private int count = 0;
	
	public int getCount() {
		return count;
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}
	
	public boolean isFull() {
		try {
			new Node<Character>('A');
			return false;
		}
		catch (OutOfMemoryError e){
			return true;
		}
	}
	
	public void add(T element) throws Exception {
		if(isFull()) throw new Exception("Memory is full, cannot add more elements.");
		if(element == null) throw new Exception("Element cannot be null.");
		Node<T> node = new Node<T>(element);
		
		if (isEmpty()) {
			first = node;
			last = node;
			count++;
			return;
		}
		
		last.setNext(node);
		node.setPrevious(last);
		last = node;
		count++;
	}
	
	//TODO: Create an Add function, that uses both element and position
	//Add checks, case if adding as first, case if adding as last.
	public void add(T element, int position) throws Exception {
		if(isFull()) throw new Exception("Memory is full, cannot add more elements.");
		if(element == null) throw new Exception("Element cannot be null.");
		if(position < 0 || position > count) throw new Exception("Position is out of bounds.");
		Node<T> node = new Node<T>(element);
		
		//Case 1: Add as first
		if(position == 0) {
			node.setNext(node);
			first.setPrevious(node);
			first = node;
			count++;
		}
		
		//Case 2: Add as last
		else if(position == count) {
			node.setPrevious(last);
			last.setNext(node);
			last = node;
			count++;
		}
		
		//Default
		else {
			
		}
	}
	
	public void print() throws Exception {
		if(isEmpty()) throw new Exception("Cannot print empty list.");
		Node<T> currentNode = first;
		
		while(currentNode != null) {
			System.out.print(currentNode.getElement() + "; ");
			currentNode = currentNode.getNext();
		}
		
		System.out.println();
	}
	
	
}
