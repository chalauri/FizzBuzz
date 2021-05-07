package main.java;

public class FizzBuzzSolver {

    public void solve() {
        for (int number = 1; number <= 100; number++) {
            if (isDividedBy(number, 3) && isDividedBy(number, 5)) {
                System.out.println("FizzBuzz");
                continue;
            }

            if (isDividedBy(number, 3)) {
                System.out.println("Fizz");
                continue;
            }

            if (isDividedBy(number, 5)) {
                System.out.println("Buzz");
                continue;
            }

            System.out.println(number);
        }

    }

    private boolean isDividedBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
