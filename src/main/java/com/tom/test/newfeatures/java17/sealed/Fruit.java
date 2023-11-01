package com.tom.test.newfeatures.java17.sealed;

public abstract sealed class Fruit permits Apple, Pear {
}

non-sealed class Apple extends Fruit {
}

final class Pear extends Fruit {
}

