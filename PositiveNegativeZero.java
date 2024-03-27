public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(-1);
        checkNumber(5);
    }

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else
            System.out.println("zero");
        System.out.println((number > 0) ? "positive": ((number < 0) ? "negative" : "zero"));
    }
}


