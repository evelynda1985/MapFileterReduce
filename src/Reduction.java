import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;



public class Reduction {

    public static int reduce(List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction){

        int result = valueIfEmpty;
        for (int value : values){
            result = reduction.apply(result,value);
        }
        return result;
    }

    public void getSumElements(List<Integer> listComplete){
        BinaryOperator<Integer> operator = (element1, element2) -> element1 + element2;
        int reduction = reduce(listComplete, 0, operator);
        System.out.println("Reduction: " + reduction);
    }

    public void getSumElementsParallelo(List<Integer> list1, List<Integer> list2){

        BinaryOperator<Integer> operator = (element1, element2) -> element1 + element2;

        Arrays.asList(list1,list2);
        int reduction1 = reduce(list1, 0, operator);
        int reduction2 = reduce(list2, 0, operator);
        int reduction = reduce(Arrays.asList(reduction1, reduction2), 0, operator);
        System.out.println("Reduction in parallelo: " + reduction);
    }

    public void getMaxElementParallelo(List<Integer> list1, List<Integer> list2){

        BinaryOperator<Integer> operator = (element1, element2) -> Integer.max(element1, element2);

        Arrays.asList(list1,list2);
        int reduction1 = reduce(list1, 0, operator);
        int reduction2 = reduce(list2, 0, operator);
        int reduction = reduce(Arrays.asList(reduction1, reduction2), 0, operator);
        System.out.println("Reduction for getting Max value in parallelo: " + reduction);
    }

}
