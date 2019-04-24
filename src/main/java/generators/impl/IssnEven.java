package generators.impl;

import annotations.numbers.Eight;
import annotations.random.FeaturedRandomNumber;
import annotations.FullNumberDescriber;
import entity.Digits;
import generators.Number;

import javax.inject.Inject;


@FullNumberDescriber(value = Digits.EIGHT, even =  true)

public class IssnEven implements Number {

    @Inject @Eight
    private String prefix;

    @Inject
    @FeaturedRandomNumber(even = true)
    private int randomNumber;

    @Override
    public String generate() {
        return prefix + randomNumber;
    }
}
