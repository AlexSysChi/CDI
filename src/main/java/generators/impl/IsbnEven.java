package generators.impl;

import annotations.parity.Even;
import annotations.random.FeaturedRandomNumber;
import annotations.numbers.NumberCountSpecifier;
import annotations.numbers.Thirteen;
import entity.Digits;
import generators.Number;

import javax.inject.Inject;


@Even
@NumberCountSpecifier(value = Digits.THIRTEEN)

public class IsbnEven implements Number {

    @Inject @Thirteen
    String prefix;

    @Inject @Thirteen
    private int editorNumber;

    @Inject
    @FeaturedRandomNumber(even = true)
    private int randomNumber;

    @Override
    public String generate() {
        return prefix + editorNumber + "-" + randomNumber;
    }
}
