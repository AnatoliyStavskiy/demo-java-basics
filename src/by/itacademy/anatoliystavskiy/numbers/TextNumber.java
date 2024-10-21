package by.itacademy.anatoliystavskiy.numbers;

public class TextNumber {

    static String StringOfNumbers(int number) {
        String numberAsAString = "";
        switch (number) {
            case 0 -> numberAsAString = "ноль";
            case 1 -> numberAsAString = "один";
            case 2 -> numberAsAString = "два";
            case 3 -> numberAsAString = "три";
            case 4 -> numberAsAString = "четыре";
            case 5 -> numberAsAString = "пять";
            case 6 -> numberAsAString = "шесть";
            case 7 -> numberAsAString = "семь";
            case 8 -> numberAsAString = "восемь";
            case 9 -> numberAsAString = "девять";
            default -> System.out.print("Нужно вводить числа от 0 до 9");
        }
        return numberAsAString;
    }
}
