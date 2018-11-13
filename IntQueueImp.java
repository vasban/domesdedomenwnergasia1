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
		int value = firstNode.data;
		Node<Integer> t = firstNode.nextnode;
		firstNode = t;
		return value;
	}

}
