package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        result = input.length() == 1 ? String.valueOf(symbol) : result;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = counter == 1 ? result + symbol : result + symbol + "" + counter;
                symbol = input.charAt(i);
                counter = 1;
            }
            if (i == input.length() - 1) {
                result = counter == 1 ? result + symbol : result + symbol + "" + counter;
            }
        }
        return result;
    }
}
