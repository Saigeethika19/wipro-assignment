import java.util.Scanner;

public class LinearSearchDemo {

public static int linearSearch(int[] a,int ele) 
{ 
	for(int i=0;i<a.length;i++) { 
		if(a[i]==ele) {
			return i;
			}
		}
	return -1;

}

public static void main(String[] args) {

int arr[]= {4,3,6,2,5,7};

Scanner sc=new Scanner(System.in);

System.out.print("Enter element to Search: ");

int target=sc.nextInt();

int result=linearSearch(arr,target);

if(result!=-1)

System.out.println("Element found at index:"+result);

else

System.out.println("Element not found");

	}
}

