package test_functions;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(12));
       

    }
}
