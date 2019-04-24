package generators.impl;

import annotations.numbers.Eight;
import annotations.random.FeaturedRandomNumber;
import annotations.numbers.NumberCountSpecifier;
import annotations.parity.Odd;
import entity.Digits;
import generators.Number;

import javax.inject.Inject;


@Odd
@NumberCountSpecifier(Digits.EIGHT)

public class IssnOdd implements Number {
    @Inject @Eight
    private String prefix;

    @Inject
    @FeaturedRandomNumber(even = false)
    private int randomNumber;

    @Override
    public String generate() {
        return prefix + randomNumber;
    }
}
