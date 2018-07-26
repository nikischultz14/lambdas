package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

//        process(someNumbers, key, (v, k) -> {
//            try {
//                System.out.println(v + key);
//            } catch (ArithmeticException e) {
//                System.out.println("An Arithmetic exception happened");
//            }
//        });
             //wrap lambda in exception lambda
        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }
        //wrap lambda in exception lambda
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
            return (v, k) -> {
                try {
                    consumer.accept(v, k);
                } catch(ArithmeticException e) {
                    System.out.println("Exception caught in wrapper lambda");
                }
            };
        }


    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
                consumer.accept(i, key);

        }
    }
}
