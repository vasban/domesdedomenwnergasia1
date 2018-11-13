import java.io.PrintStream;
import java.util.NoSuchElementException;

public class IntQueueImp {
	private Node<Integer> firstNode;
	private Node<Integer> lastNode;
	private String name;
	
	public IntQueueImp() {
		this("IntQueue");
	}
	public IntQueueImp(String queuename) {
		name = queuename;
		firstNode = lastNode = null;
	}
	public boolean isEmpty() {
		return firstNode==null;
	}
	
	public void put(int item) {
		Node<Integer> t = lastNode;
		lastNode = new Node<Integer>(item);
		if(isEmpty()) firstNode = lastNode;
		else t.nextnode = lastNode;
		
	}
	public int get() throws NoSuchElementException{
		if(isEmpty()) throw new NoSuchElementException(name);
		
		int value = firstNode.data;
		
		if(firstNode == lastNode) firstNode=lastNode=null;
		else firstNode = firstNode.nextnode;
		return value;
	}
	public int peek() throws NoSuchElementException{
		if(isEmpty()) throw new NoSuchElementException(name);
		return firstNode.data;
	}
	public void print() {
		if(isEmpty()) {
			System.out.printf("Empty %s\n", name);
			return;
		}
		System.out.printf("Empty %s\n", name);
		Node<Integer> current = firstNode;
		
		while (current!=null) {
			System.out.printf( "%s ", current.data );
			current = current.nextnode;
		}
		System.out.println( "\n" );
	}

}
