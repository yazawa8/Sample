import java.util.function.Function;

public class FunctionImplSample {

    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i * 2;

        System.out.println(f.apply(2));
    }
}