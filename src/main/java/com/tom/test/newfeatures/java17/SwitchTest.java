package com.tom.test.newfeatures.java17;

public class SwitchTest {

    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
        String text = switch (fruit) {
            case APPLE, PEAR -> "Domestic fruit";
            case MANGO, AVOCADO -> "Imported fruit";
            default -> "Unknown fruit";
        };
        System.out.println(text);

        fruit = Fruit.AVOCADO;
        text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("You input " + fruit);
                yield "Domestic fruit";
            }
            case MANGO, AVOCADO -> "Imported fruit";
            default -> "Unknown fruit";
        };
        System.out.println(text);

        fruit = Fruit.BANANA;
        System.out.println(switch (fruit) {
            case APPLE, PEAR:
                yield "Domestic fruit";
            case MANGO, AVOCADO:
                yield "Imported fruit";
            default:
                yield "Unknown fruit";
        });

    }
}

enum Fruit {
    APPLE, PEAR, MANGO, AVOCADO, BANANA
}
