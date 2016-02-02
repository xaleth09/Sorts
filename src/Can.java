
public class Can {
	
	private int data;
	
	public Can(){
		data = 0;
	}
	
	public void setData(int val){
		
		data = val;
		
	}
	
	public int getData(){
		return data;
		
	}
	
	public String toString(){
		String rtn = "";
		
		rtn = Integer.toString(data);
		
		return rtn;
	}
	
}
