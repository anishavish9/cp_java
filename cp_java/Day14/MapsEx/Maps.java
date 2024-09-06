package MapsEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {

	public static void main(String[] args) {
		//map
		List<String> list1 = Arrays.asList("11", "23", "44", "70");
		List<Double> l2 = list1.stream().map(Double :: valueOf).collect(Collectors.toList());
		System.out.println("Original List: "+list1);
		System.out.println("list after map  operation : "+l2);
		
		
		// flatMap
        List<List<Integer>> list2 = Arrays.asList(Arrays.asList(11,12,13),Arrays.asList(24,34,44),Arrays.asList(23,14,06,30));
        List<Integer>  flatList = list2.stream().flatMap(a -> a.stream()).toList();
        System.out.println ("Original List : "+list2);
        System.out.println ("List after map operation : "+flatList);
        
        //example - map
  		List<Integer> list3 = Arrays.asList(54, 66, 11, 4);
  		List<Integer> sortedList3 = list3.stream().sorted().map(Integer :: valueOf).collect(Collectors.toList());
  		System.out.println("\nList before sorted : " +list3);
  		System.out.println("After sorted : "+sortedList3);
        
        //flat map example
  		 List<List<String>> list4 = Arrays.asList(Arrays.asList("Hello","Hi","How"),Arrays.asList("are","you"));
  		 List<String> flatList2 = 
  			list4.stream().flatMap(List :: stream).filter(s -> s.toLowerCase().contains("i")).collect(Collectors.toList());
  		 System.out.println("\nOriginal List : "+list4);
  		 System.out.println("String which contains i : "+flatList2);
	
	}

}
