/*Implement a 'LinkedList' class in Java with methods to add, remove, retrieve, and display elements, ensuring efficient handling of edge cases without using Java's built-in collection classes.*/

class Node {

int data;

Node next;

public Node(int data) {

this.data = data;

this.next = null;

}

}

public class LinkedList {

private Node head;

public LinkedList() {

this.head = null;
}

public void add(int data) {

Node newNode = new Node(data);

if (head == null) {

head = newNode;

return;

}

Node current = head;

while (current.next != null) {

current = current.next;

}

current.next = newNode;
}


public void remove(int data) {

// If the list is empty, return

if (head == null) {

return;

}

if (head.data == data) {

head = head.next;

return;

}

Node current = head;

while (current.next != null && current.next.data != data) {

current = current.next;

}

if (current.next != null) {

current.next = current.next.next;
}

}

public int get(int index) {

//exception

if (index < 0 || head == null) {

throw new IndexOutOfBoundsException("Index out of bounds"); }

Node current = head;

int currentIndex = 0;

while (current != null && currentIndex < index) {

current = current.next;

currentIndex++;

}

if (current == null) {
	throw new IndexOutOfBoundsException("Index out of bounds"); 
}
return current.data;
}

public void display() {

Node current = head;

while (current != null) {

System.out.print(current.data + " ");

current = current.next;

}

System.out.println();

}

public static void main(String[] args) {
	LinkedList list = new LinkedList();

	list.add(1);

	list.add(2);

	list.add(3);

	list.add(4);

	System.out.print("Initial list: ");
	list.display();

	list.remove(3);

	System.out.print("After removing 3: ");

	list.display();

	int elementAtIndex2 = list.get(2);

	System.out.println("Element at index 2: " + elementAtIndex2);

}

}
