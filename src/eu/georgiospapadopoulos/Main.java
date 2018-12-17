package eu.georgiospapadopoulos;


/*
Challenge text:
Write a method named hasSameLastDigit with 3 parameters of type in.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range , the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
otherwise, it should return false.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    /**
     * Receives 3 numbers as parameters and checks if at least 2 of them have the
     * same last digit.
     *
     * @param first (int)
     * @param second (int)
     * @param third (int) 
     * @return true if at least 2 numbers have the same last digit, false if not.
     */
    private static boolean hasSameLastDigit(int first, int second, int third) {
        if ((first < 10 || first > 1000) || (second < 10 || second > 1000) ||
                (third < 10 || third > 1000))
            return false;

        first %= 10;
        second %= 10;
        third %= 10;

        if (first == second || first == third || second == third)
            return true;

        return false;

    }
}
