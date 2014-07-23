package int_sort;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="SortStrategy")
public class XMLParser {
	@Element
	private String sortTYpe;
	
	public XMLParser() {
		super();
	}
	
	public String GetSortType() {
		return this.sortTYpe;
	}
}
