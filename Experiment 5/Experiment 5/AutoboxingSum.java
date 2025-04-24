import java.util.List;
import java.util.ArrayList;

public class AutoboxingSum {
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> parseStringToIntegers(String[] strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str));
        }
        return numbers;
    }

    public static void main(String[] args) {
        String[] inputNumbers = {"10", "20", "30", "40", "50"};
        List<Integer> numbers = parseStringToIntegers(inputNumbers);
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }
}
