/*
 * Task 1: Bit Manipulation Basics
 * Create a function that counts the number of set bits (1s) in the binary representation of an integer. Extend this to count the total number of set bits in all integers from 1 to n.
 */

package bitwisealgorithm;
import java.util.*;
public class CountSetBitsDemo {

	static int countTotalSetBits(int n) {
		int count = 0;
		for(int i = 0; i < 16; i++) {
			int blocksize = 1 << (i + 1);
			int fullBlocks = (n + 1) / blocksize;
			count += fullBlocks * (blocksize / 2);
			
			int remainder = ( n + 1) % blocksize;
			
			if(remainder > blocksize / 2) {
				count += remainder - (blocksize / 2);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int totalSetBits = countTotalSetBits(n);
		System.out.println("Total set bits from 1 to " + n + ": " +
		totalSetBits);
	}

}