package dataStructures;

public class SLinkedList<T> {
	private Node<T> headPointer, tailPointer;
	private int size;
	private class Node<T>{
		T data;
		Node<T> next;
		public Node(T data) {
			this.data = data;
			size++;
		}
	}

	public SLinkedList(T data){
		headPointer = tailPointer = new Node<T>(data);
	}
	
	public void pushFront(T data){
		Node<T> newNode = new Node<T>(data);
		if(headPointer == null) {
			headPointer = newNode;
			tailPointer = newNode;
		}
		else {
			newNode.next = headPointer;
			headPointer = newNode;
		}
		size++;
	}
	
	public T topFront() {
		return headPointer.data;
	}
	
	public void popFront() {
		if(headPointer == null) {
			
		}
		else {
			headPointer = headPointer.next;
			size--;
		}
	}
	
	//append(data)
	public void pushBack(T data) {
		Node<T> newNode = new Node<T>(data);
		if(headPointer==null) {
			headPointer = newNode;
			tailPointer = newNode;
		}
		else {
			tailPointer.next = newNode;
			tailPointer = newNode;
			tailPointer.next = null;
		}
		size++;
	}
	
	public T topBack() {
		return tailPointer.data;
	}
	
	public void popBack() {
		if(headPointer == null) {
			
		}
		else {
			Node<T> node = headPointer;
			while(node.next != tailPointer) {
				node = node.next;
			}
			node.next = null;
			tailPointer = node;
			size--;
		}
	}
	
	public void printList() {
		Node<T> node = headPointer;
		while(node!=null){
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print("\n");
	}
	
	
	public int getSize(){
		return size;
	}
	public static void main(String args[]){
		SLinkedList<Integer> test = new SLinkedList<Integer>(6);
		test.printList();
		System.out.println(test.topFront());
		System.out.println(test.topBack());
		System.out.println();
		test.pushFront(7);
		test.printList();
		System.out.println(test.topFront());
		System.out.println(test.topBack());
		System.out.println();
		test.pushBack(8);
		test.printList();
		System.out.println(test.topFront());
		System.out.println(test.topBack());
		System.out.println();
		test.popFront();
		test.printList();
		System.out.println();
		test.popBack();
		test.printList();
		System.out.println("Done");
		
	}
	
}
