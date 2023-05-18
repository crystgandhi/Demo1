import java.util.*;
import java.util.stream.Collectors;

public class HashmapAddNumbers {

	static int target = 9;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 6, -4, 3, 1, 8);
		System.out.println(list.stream().map((x)->target-x).anyMatch((l)->l.equals(list)));
		System.out.println(list);
	}
}
