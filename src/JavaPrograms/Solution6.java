package JavaPrograms;
import java.util.stream.Stream;
public class Solution6 {
	public static void main(String[] args) {
		Stream<Integer> numStream = Stream.of(1,4,3,2,5,8,9,0);
		
		numStream.sorted()
		         .forEach(System.out::println);
		
	}

}
