//Implement a Jump Search algorithm in Java to efficiently search for a target value in a sorted array.

public class JumpSearchDemo {

static int jumpSearch(int[] arr, int x) {

int n=arr.length;

int step=(int)Math.floor(Math.sqrt(n));

int prev=0;

System.out.println(". --");

System.out.println("Iteration start: "+prev);

System.out.println("Array length is:"+n);

System.out.println("Step value is: "+step);

for(int minStep=Math.min(step, n)-1;arr[minStep]<x;minStep=Math.min(step, n)-1) {

	prev=step;

	step+=(int)Math.floor(Math.sqrt(n));

	if(prev>=n)

		return -1;
	}

	while(arr[prev]<x){

		prev++;
		
		if(prev==Math.min(step, n))

			return -1;

	}

	return -1;
}

public static void main(String[] args) {

int arr[]= {0,1,2,3,4,5,8,13,21,34,55,89,144,233,377,610};
int x=55;

int result=jumpSearch(arr,x);

System.out.println("\n Number: "+x+" is at index :"+result);

}

}