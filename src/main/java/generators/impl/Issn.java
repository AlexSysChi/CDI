package generators.impl;

import annotations.numbers.Eight;
import annotations.random.RandomNumber;
import generators.Number;

import javax.inject.Inject;


@Eight
public class Issn implements Number {

    @Inject @Eight
    private String prefix;

    @Inject @RandomNumber
    private int randomNumber;

    @Override
    public String generate() {
        return prefix + randomNumber;
    }
}
