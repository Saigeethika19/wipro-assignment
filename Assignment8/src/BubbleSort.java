//Implement a Java method to perform Bubble Sort on an array of integers.

public class BubbleSort {

static void bubbleSort(int arr[], int n) {

	int temp;

	for(int i=0;i<n-1;i++) {

		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
		}
	}
}

static void printArray(int arr[], int n) {

	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	System.out.println("\n");
}

public static void main(String[] args) {

	int arr[]= {20,5,30,15,25,10};

	int n=arr.length;

	System.out.println("Array before sorting: ");

	printArray(arr,n);

	bubbleSort(arr,n);

	System.out.println("Array after sorting: ");

	printArray(arr,n);
	}
}