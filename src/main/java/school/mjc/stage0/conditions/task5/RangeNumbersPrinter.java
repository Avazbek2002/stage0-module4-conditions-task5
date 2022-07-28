package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        if (number >= 1 && number <= 5)
            System.out.println("number is between 1 and 5");
        if (number >= 6 && number <= 10)
            System.out.println("number is between 6 and 10");
        else
            System.out.println("out of range");
    }
}
