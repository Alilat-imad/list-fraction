package partition;

import java.util.Arrays;
import java.util.List;

import shared.Partition;

public class App {

	public static void main(String[] args) {
		List<Integer> theList = Arrays.asList(1, 2, 3 , 4, 5);
		int thePortionNb = 3;
		
		
		// partition a list into partitions of given size
		List<Integer>[] partition = new Partition(theList, thePortionNb).getSubListsByPortion();

		// print the partitions
		for (int i = 0; i < partition.length; i++)
			System.out.println("Partition " + (i + 1) + ": " + partition[i]);
		
	}

}
