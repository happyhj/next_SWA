package int_sort;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class SortFactory {
	public static ISort getInstance() throws Exception {
		Serializer serializer = new Persister();
		File file = new File("NewFile.xml");
		
		XMLParser parser = serializer.read(XMLParser.class, file);
		String sortType = parser.GetSortType();
		System.out.println("using "+sortType);
		ISort sorter_instance = (ISort) Class.forName("int_sort."+sortType).newInstance();
		return sorter_instance;
	}
}
