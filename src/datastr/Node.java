package datastr;

public class Node<T> {
	private T element;
	private Node<T> next = null;
	private Node<T> previous = null;
	
	public T getElement() {
		return element;
	}
	public Node<T> getNext() {
		return next;
	}
	public Node<T> getPrevious() {
		return previous;
	}
	
	public void setElement(T element) {
		if(element != null) {
			this.element = element;
			return;
		}
		this.element = (T)new Object();
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
	public Node(T element) {
		setElement(element);
	}
	
	public String toString( ) {
		return "" + element;
	}
}