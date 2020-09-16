package shared;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PartitionTest {


	@Test
	public void testGetSubListsByPortion() {
		
		
		
		
		List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        Partition testPartition1 = new Partition(list, 1);
        List<List<Integer>> result1 = testPartition1.getSubListsByPortion();
        System.out.println(result1.get(2).size());
        assertTrue(result1.size()==8);
        assertTrue(result1.get(0).size()==1);
        
        
        Partition testPartition2 = new Partition(list, 5);
        List<List<Integer>> result2 = testPartition2.getSubListsByPortion();
        assertTrue(result2.size()==2);
        assertTrue(result2.get(0).size()==5);
        assertTrue(result2.get(1).size()==3);

	}


}
