package sorting;

public class InsetionSort {
	
	int[] nos = new int[]{1,12,4,5,17,9};
	
	public static void main(String[] args) {
		InsetionSort sort = new InsetionSort();
		sort.insertionSort();
		for (int i = 0; i < sort.nos.length-1; i++) {
			System.out.println(sort.nos[i]);
		}
	}
	
	private  void insertionSort(){
		for (int i = 1; i < nos.length-1; i++) {
			int j = i;
			int swapNo = nos[j];
			while((j > 0)&& (nos[j] < nos[j-1])){
				nos[j]= nos[j-1];
				j--;
			}
			nos[j] =  swapNo;			
		}
	}

}
