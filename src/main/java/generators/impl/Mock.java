package generators.impl;

import generators.Number;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mock implements Number {
    @Override
    public String generate() {
        return "MOCK";
    }
}
