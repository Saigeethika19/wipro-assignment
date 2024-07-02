//Implement the Quick Sort algorithm in Java to sort an array of integers in ascending order.

public class QuickSortDemo {

static void swap(int arr[], int i, int j) {

	int temp=arr[i];
	arr[i]=arr[j]; 
	arr[j]=temp;
}
static int partition(int[] arr,int low, int high) {

	int pivot=arr[high];

	int i=(low-1);

	for(int j=low;j<=high;j++) {

		if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
		}
	}

	swap(arr,i+1,high);

return (i+1);

}

static void quicksort(int[] arr, int low,int high) {

	if(low<high) {
		int pi=partition(arr, low,high);
		quicksort(arr, low,pi-1);
		quicksort(arr,pi+1,high);
		}
}

public static void printArr(int[] arr) {

for(int i=0;i<arr.length;i++) {

	System.out.print(arr[i]+" ");

	}

}
public static void main(String[] args) {

int arr[]= {10,7,3,6,2,5,1};

int N=arr.length;

quicksort(arr,0,N-1);

System.out.println("Sorted arary is: ");

printArr(arr);

}
}