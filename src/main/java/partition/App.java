package partition;

import java.util.Arrays;
import java.util.List;

import shared.Partition;

public class App {

	public static void main(String[] args) {
		List<Integer> theList = Arrays.asList(1, 2, 3 , 4, 5);
		int thePortionNb = 3;
				
		
		List<List<Integer>> listPartitions = new Partition(theList, thePortionNb).getSubListsByPortion();
		System.out.println("Final result is : " + listPartitions);
		
	}

}
