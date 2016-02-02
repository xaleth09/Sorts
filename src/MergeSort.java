
public class MergeSort {

	public void recMergeSort(int data[], int first, int n) {
		int n1 , n2;
		
		if(n > 1){
			n1 = n/2;
			n2 = n - n1;
			
			recMergeSort(data, first, n1);
			recMergeSort(data, first+n1, n2);
			System.out.println("Before Merge: ");  print(data);
			merge(data, first, n1, n2);
		}
		
	}
	
	public void merge(int [] data, int first, int n1, int n2){
		int [] temp = new int [n1 + n2];
		int cT = 0, c1 = 0, c2 = 0;
		int i;
		
		while ((c1 < n1) && (c2 < n2)){
			if(data[first+c1] < data[first + n1 + c2]){
				temp[cT++] = data[first + (c1++)];
			}else{
				temp[cT++] = data[first + n1 + (c2++)]; 
			}
			
		}
		
		while( c1 < n1){
			temp[cT++] = data[first + (c1++)];
		}
		
		for(i = 0; i < cT; i++){
			data[first + i] = temp[i];
		}
	
	}
	
	public String print(int [] arr){
		String rtn = "";
		for(int i = 0; i < arr.length; i++){
			rtn += arr[i] + " ";
		}
		rtn += "\n";
		return rtn;
	}
	
	public String print(int [] arr, int start, int length){
		String rtn = "";
		for(int i = start; i < start + length; i++){
			rtn += arr[i];
		}
		rtn += "\n";
		return rtn;
	}

	
}
