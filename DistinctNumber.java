import java.util.ArrayList;
import java.util.List;

public class DistinctNumber {
	public static void main(String[] args) {
  System.out.println("Find Distinct Numbers");
  List<Integer> list = new ArrayList<Integer>();
  list.add(49);
  list.add(67);
  list.add(19);
  list.add(74);
  list.add(19);
  list.add(36);
  list.add(45);
  list.add(67);
  list.stream().filter((n)-> n%2==0).forEach(System.out::println);
  System.out.println();
  list.stream().sorted((a, b) -> b - a).forEach(System.out::println);
  System.out.println();
  list.stream().distinct().sorted().forEach(System.out::println);
	}}
