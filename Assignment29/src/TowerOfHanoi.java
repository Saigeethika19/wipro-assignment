/*
 * Task 1: Tower of Hanoi Solver
Create a program that solves the Tower of Hanoi puzzle for n disks. The solution should use recursion to move disks between three pegs (source, auxiliary, and destination) according to the game's rules. The program should print out each move required to solve the puzzle.
 */
public class TowerOfHanoi {
	//Method to solve the tower of Hanoi puzzle
	public static void solveTowerOfHanoi(int n, char sourceRod, char targetRod, char auxiliaryRod) {
		//Base case: if there only one disk, move it from source to target
		if(n == 1) {
			System.out.println("Move disk 1 from rod " + sourceRod + "to rod " + targetRod);
			return;
		}
		//Move n-1 disks from source to auxiliary, using target as auxiliary
		solveTowerOfHanoi(n-1, sourceRod, auxiliaryRod, targetRod);
		
		//move the nth disk from source to target
		System.out.println("Move disk " + n + " from rod " + sourceRod + " to rod " + targetRod);
		
		//Move the n-1 disks from auxiliary to target using source as auxiliary
		solveTowerOfHanoi(n - 1, auxiliaryRod, targetRod, sourceRod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfDisks = 3; //Number of disks
		//solving the Puzzle
		solveTowerOfHanoi(numberOfDisks, 'A', 'B', 'C');

	}

}
