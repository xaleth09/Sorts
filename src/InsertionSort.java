
public class InsertionSort {

	public void InsertSort(int [] arr){
		int [] nArr = new int[arr.length];
		int big;
		
		for(int i = nArr.length-1; i >= 0 ;i++){
			big = 0;
			for(int j =0; j < nArr.length; j++){
				if(arr[j] > arr[i]){
					big = j;
				}
			}
			nArr[i] = arr[big];
		}
	}

}
