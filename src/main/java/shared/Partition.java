package shared;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
* Represents a shared library function about split up 
* This Partition class implements an application that
* simply fraction-up a list to multiple sub-list based on portion number.
*
* @author  Imad ALILAT
* @version 1.0
*/

public final class Partition {
	
	private final List<Integer> list;
	private final int portion;
	
	public Partition(List<Integer> list, int portion) {
		this.list = new ArrayList<Integer>(list);
		this.portion = portion;
	}


	public final List<List<Integer>> getSubListsByPortion(){
		
		if(this.list == null) {
			System.out.println("Exception raised - FS001 : Please, enter a valid list of integer. Example : [1, 2 , 3] ");
			throw new NullPointerException("Exception FS001 : 'List' is NULL ! ");
		}
		
		if(this.portion <= 0) {
			System.out.println("Exception raised - FS002 : 'Portion' is not > 0 !");
			throw new NullPointerException("Exception FS002 : 'Portion' is not > 0 !");
		}
		
		int partitionNb = this.getPartitionNb();
		
		List<Integer>[] partitions = this.createPartitionBy(partitionNb);
		
		for(int i = 0; i < list.size(); i++) {
			
			int position = i / this.portion;
			
			partitions[position].add(list.get(i));
		}
		
		return Arrays.asList(partitions);
	}
	
	public final int getPartitionNb() {
		int size = this.list.size();
		int rest = size % this.portion;
		int division = size / this.portion;
		
		return (rest == 0) ? division : ++division;	
	}
	
	public final List<Integer>[] createPartitionBy(int partitionNb){
		@SuppressWarnings("unchecked")
		List<Integer>[] partitions = new ArrayList[partitionNb];
		for(int i = 0; i < partitionNb; i++)
			partitions[i] = new ArrayList<Integer>();
		
		return partitions;
	}
}
