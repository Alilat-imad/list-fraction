package partition;

import java.util.Arrays;
import java.util.List;

import shared.Partition;

public class App {

	public static void main(String[] args) {
		List<Integer> theList = Arrays.asList(1, 2, 3 , 4, 5);
		int thePortionNb = 3;
			
	
		System.out.println("> Input list as param : " + Arrays.toString(theList.toArray()));
		System.out.println("> Input portion : " + thePortionNb);
		
		List<List<Integer>> listPartitions = new Partition(theList, thePortionNb).getSubListsByPortion();
		System.out.println("\n => Output result : " + listPartitions);
		
	}

}
