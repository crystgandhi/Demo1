import java.util.ArrayList;
import java.util.List;

public class DistinctNumber {
	public static void main(String[] args) {
  System.out.println("Find Distinct Numbers");
  List<Integer> list = new ArrayList<Integer>();
  list.add(49);
  list.add(67);
  list.add(19);
		list.add(75784);
		list.add(19);
  list.add(36);
  list.add(345);
  list.add(67);
  list.stream().distinct().sorted().forEach(System.out::println);
	}}
