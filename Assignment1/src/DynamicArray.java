//Create a Java class that implements basic operations on a dynamic array. The class should be able to handle typical array operations such as insertion, deletion, updating, and retrieval of elements.

public class DynamicArray {

	private int[] array;

	private int size;

	private int capacity;

	public DynamicArray() {

		capacity = 10;
		array = new int[capacity];
		size = 0;
	}

	public int size() {

		return size;

	}

	public boolean isEmpty() {

		return size == 0;

	}

	public int get(int index) {

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return array[index];

	}

	public void set(int index, int value) {

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException("Index out of bounds");
			
		}

		array[index] = value;

	}

	public void add(int value) {

		if (size == capacity) {

			resizeArray();

		}
		array[size] = value;

		size++;

	}

	public void insert(int index, int value) { if (index < 0 || index > size) {

		throw new IndexOutOfBoundsException("Index out of bounds");

	}

	if (size == capacity) { 
		resizeArray();

	}

	for (int i = size; i > index; i--) {

		array[i] = array[i - 1];
	}

	array[index] = value;

	size++;

	}

	public void remove(int index) {

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException("Index out of bounds");

		}

		// Shift elements to the left to remove the element

		for (int i = index; i < size - 1; i++) { array[i] = array[i + 1];

		}
		size--;

	}

	private void resizeArray() {

		capacity *= 2; // Double the capacity

		int[] newArray = new int[capacity];

		// Copy elements to the new array

		System.arraycopy(array, 0, newArray, 0, size);

		array = newArray;

	}

	public void printArray() {

		if (size == 0) {

			System.out.println("[]");

			return;
		}

		System.out.print("[");

		for (int i = 0; i < size - 1; i++) {

			System.out.print(array[i] + ", ");

		}

		System.out.println(array [size - 1] + "]");

	}

	public static void main(String[] args) {

		DynamicArray dynArray = new DynamicArray();

		dynArray.add(10);

		dynArray.add(20);
		dynArray.add(30);

		dynArray.printArray(); // [10, 20, 30]

		dynArray.insert(1, 15);

		dynArray.printArray(); // [10, 15, 20, 30]

		dynArray.remove(2);

		dynArray.printArray(); // [10, 15, 30]

		System.out.println("Element at index 1: " + dynArray.get(1)); // Element at index 1: 15

		dynArray.set(2, 35);
		dynArray.printArray(); // [10, 15, 35]

	}

}