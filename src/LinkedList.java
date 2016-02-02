
public class LinkedList {
	private Node head;
	private int size;
	
	//Constructors
	
	private LinkedList(){
		head = null;
		size = 0;
	}
	
	public LinkedList create(){
		LinkedList n = new LinkedList();
		
		return n;
	}
	
	//ADD and REMOVE
	public void addHead(int val){
		Node n = new Node();
		Can data = new Can();
		
		data.setData(val);
		n.setData(data);
		
		n.setNext(head);
		head = n;
		size++;
	}
	
	public int removeHead(){
		if(this.isEmpty()) return -1;
		
		int val = head.getData().getData();
		head = head.getNext();
		size--;
		return val;
		
	}
	
	public void insertAfter(Node n, int val){
		if(n == null) return;
		
		//Set up new Can with val inside of new Node nNode
		Node nNode = new Node();
		Can can = new Can();
		can.setData(val);
		nNode.setData(can);;
		
		//add node after n
		
		nNode.setNext(n.getNext());
		n.setNext(nNode);
		
	}
	
	//Search
	public Node search(int val){
		Node rtn = null;
		Node ref = head;
		
		while(ref != null){
			if(ref.getData().getData() == val){
				rtn = ref;
				break;
			}
			ref = ref.getNext();
		}
		
		return rtn;
	}
	
	
	
	//Helper functions
	public boolean isEmpty(){
		
		return size == 0;
	}
	
	public String toString(){
		String rtn = "";
		
		Node ref = head;
		
		if(ref == null) return "<empty>";
		
		while(ref != null){
			
			rtn += ref.getData().getData() + " -> " ;
			ref = ref.getNext();
		}
		rtn += "null"+"\n";
		
		return rtn;
	}
	
	
	
}
