//Implement a binary search algorithm in Java that takes a sorted array of integers and a target value, and returns the index of the target if found or -1 if not found.

import java.util.Scanner;

public class BinarySearchDemo {

static int binarySearch(int a[], int low, int high, int ele){
	while(low<=high) {
		int mid=(low+high)/2; 
		if(a[mid]==ele)
			return mid;
		else{
			if(a[mid]>ele)
				high=mid-1;
			else
				low=mid+1;
			}

	}
	return -1;
}

public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to search : ");
	int ele=sc.nextInt();
	int a[]= {1,2,3,4,5,6,7,8};
	int low=0;
	int high=a.length-1;
	int result=binarySearch(a,low,high,ele);
	if(result!=-1)
		System.out.println("Element found at index:"+ result);
	else
		System.out.println("Element not found");
	}

}
