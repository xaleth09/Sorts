
public class BubbleSort {

	public BubbleSort(int [] arr) {
	
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length - 1; i ++){
				if(arr[i] < arr[j]){
					swap(arr, i, j);
				}	
			}
		
		}
		
	}
	
	
	public void swap(int [] arr, int i, int j){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
