import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		List<Number> list0 = new ArrayList<Number>();
		List<Number> list1 = List.of(5,7,8,9);
//		List<String> list2 = new LinkedList<>();
		list0.add(0.5);
		list0.add(55);
		list0.add(22.5);
		list0.addAll(list1);
		for (Number ele : list0)
			System.out.print(ele + " ");
		System.out.println();
		System.out.println(list0.getClass());
		logger.info("info");
		logger.warn("warn");
		logger.debug("debug");
		logger.error("error");
		logger.trace("trace");
	}

}
