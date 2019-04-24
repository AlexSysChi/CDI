package producers;

import annotations.numbers.Eight;
import annotations.random.FeaturedRandomNumber;
import annotations.random.RandomNumber;
import annotations.numbers.Thirteen;

import javax.enterprise.inject.Produces;
import java.util.Random;

public class NumberPartProducer {
    @Produces @RandomNumber
    private int simpleRandomNumber = rand();

    @Produces @FeaturedRandomNumber(even = true)
    private int evenRandomNumber = rand(true);

    @Produces @FeaturedRandomNumber(even = false)
    private int oddRandomNumber = rand(false);

    @Produces @Eight
    String issnPrefix = "8-";

    @Produces @Thirteen
    String isbnPrefix = "13-";

    @Produces @Thirteen
    private int editorNumber = 84356;

    private int rand() {
        return  Math.abs(new Random().nextInt());
    }

    private int rand(boolean even) {
        int value = rand();
        boolean isEven = (value % 2 == 0);
        if (even != isEven) {
            value++;
        }
        return value;
    }
}
