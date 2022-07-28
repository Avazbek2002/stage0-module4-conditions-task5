package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month % 4 == 0) {
            if (month % 100 != 0)
                System.out.println("leap");
            else if (month % 400 == 0) {
                System.out.println("leap");
            }
            else
                System.out.println("not leap");
        }

        else
            System.out.println("not leap");
    }
}
