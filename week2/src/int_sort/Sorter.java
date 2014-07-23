package int_sort;

public class Sorter {

	public static void main(String[] args) throws Exception {
		int[] data = {1,3,5,2};

		ISort sorter = SortFactory.getInstance();
		
		int[] result = sorter.Sort(data);
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
