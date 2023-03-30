package test_functions;

import java.util.function.Function;

public class TestFunction {
    
    public static void main(String[] args) {
        
        Function<Integer,Boolean> isEven = x -> x % 2 == 0;
        System.out.println(isEven.apply(2));

    }


}
