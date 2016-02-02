
public class SelectionSort {

		public void SelectSort(int [] arr, int first) {
			int i, j, big, temp;
			
			int [] unArr = new int [arr.length];
			for(i = unArr.length - 1; i > 0; i--){
				big = first;
				for(j = first + 1; j <= first + i; j++){
					if(arr[big] < arr[j]){
						big = j;
					}
					
				}
				temp = arr[first+i];
				arr[first+i] = arr[big];
				arr[big] = temp;
			}
			
			
			
		}

}
