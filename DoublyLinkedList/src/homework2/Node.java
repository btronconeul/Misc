package homework2;

public class Node<T> {

	private T value;
	private Node<?> pointerNode = null;
	private Node<?> previousNode = null;

	public Node(T input) {
		this.value = input;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<?> getPointerNode() {
		return pointerNode;
	}

	public void setPointerNode(Node<?> pointerNode) {
		this.pointerNode = pointerNode;
	}

	
	@Override
	public String toString() {
		return "Node [value=" + value + ", pointerNode=" + pointerNode
				+ ", previousNode=" + previousNode + "]";
	}

	public Node<?> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node<?> previousNode) {
		this.previousNode = previousNode;
	}

	
    
	
	
}
