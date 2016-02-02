
public class Node {
	private Can data;
	public Node next;
	
	//Constructors
	public Node(){
		next = null;
		data = null;
	}
	
	public Node(int n){
		data = new Can();
		data.setData(n);	
	}

	//Mess with the Node
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
		
	
	//Mess with the Can
	public void setData(Can c){
		data = c;	
	}
	
	public Can getData(){
		return data;
	}

	
	
}

