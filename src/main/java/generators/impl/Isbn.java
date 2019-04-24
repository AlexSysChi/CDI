package generators.impl;

import annotations.random.RandomNumber;
import annotations.numbers.Thirteen;
import generators.Number;

import javax.inject.Inject;



@Thirteen
public class Isbn implements Number {

    @Inject @Thirteen
    String prefix;

    @Inject @Thirteen
    private int editorNumber;

    @Inject @RandomNumber
    private int randomNumber;

    @Override
    public String generate() {
        return prefix + editorNumber + "-" + randomNumber;
    }
}
