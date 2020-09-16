package shared;

import java.util.ArrayList;
import java.util.List;

public class Partition {
	
	private final List<Integer> list;
	private final int portion;
	
	public Partition(List<Integer> list, int portion) {
		this.list = new ArrayList<Integer>(list);
		this.portion = portion;
	}

	
	public final List<Integer>[] getSubListsByPortion(){
		
		if(this.list == null) {
			System.out.println("Exception raised - FS001 : Please, enter a valid list of integer. Example : [1, 2 , 3] ");
			throw new NullPointerException("Exception FS001 : 'List' is NULL ! ");
		}
		
		if(this.portion <= 0) {
			System.out.println("Exception raised - FS002 : 'Portion' is not > 0 !");
			throw new NullPointerException("Exception FS002 : 'Portion' is not > 0 !");
		}
		
		int partitionNb = this.getPartitionNb();
		
		List<Integer>[] partitions = this.createPartition(partitionNb);
		
		for(int i = 0; i < list.size(); i++) {
			
			int position = i / this.portion;
			
			partitions[position].add(list.get(i));
		}
		return partitions;
	}
	
	public final int getPartitionNb() {
		
		int size = this.list.size();
		int rest = size % this.portion;
		int division = size / this.portion;
		
		return (rest == 0) ? division : ++division;	
	}
	
	public final List<Integer>[] createPartition(int pNb){
		List<Integer>[] partitions = new ArrayList[pNb];
		
		for(int i = 0; i < pNb; i++)
			partitions[i] = new ArrayList<Integer>();
		
		return partitions;
	}
}
