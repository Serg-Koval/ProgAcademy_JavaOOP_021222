package three;

import java.util.Comparator;

public class PairsComparator implements Comparator<Pair> {

	@Override
	public int compare(Pair p1, Pair p2) {
		
		if(p1.getCounter() > p2.getCounter()) {
			return -1;
		}
		
		if(p1.getCounter() < p2.getCounter()) {
			return 1;
		}
				
		return 0;
	}

}
