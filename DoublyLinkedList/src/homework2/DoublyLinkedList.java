package homework2;

public class DoublyLinkedList {

	

	private Node<?> backTraceNode = null;
	private Node<?> firstNode = null;
	private Node<?> lastNode = null;

	public <T> void add(T input) {
		Node<?> tmpNode = new Node<Object>(input);
		if(backTraceNode!=null){
			backTraceNode.setPointerNode(tmpNode);
			tmpNode.setPreviousNode(backTraceNode);
			lastNode = tmpNode;
		}else{
			firstNode=tmpNode;
		}
		backTraceNode = tmpNode;
	}

	public String printForward() {
		StringBuffer result = new StringBuffer();
		Node<?> tmpNode = firstNode;
		while(tmpNode!=null){
			result.append(tmpNode.getValue() + " ");
			tmpNode =tmpNode.getPointerNode();
		}
		return result.toString();
	}
	
	public String printReverse() {
		
		StringBuffer reversedResult = new StringBuffer();
		Node<?> tmpNode = lastNode;
		while(tmpNode!=null) {
			reversedResult.append(tmpNode.getValue() + " ");
			tmpNode = tmpNode.getPreviousNode();
		}
		
		return reversedResult.toString();
		
	}
}
