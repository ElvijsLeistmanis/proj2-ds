package datastr;

public class LinkedList<T> {
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
}
