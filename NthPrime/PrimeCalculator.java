package NthPrime;

import java.util.stream.IntStream;
class PrimeCalculator {
    int nth(int nth) {
        if (nth < 1) throw new IllegalArgumentException();
        if (nth == 1) return 2;
        int index = 3;
        int foundPrimesSoFar = 1;
        while (true) {
            if (isPrime(index)) foundPrimesSoFar++;
            if (foundPrimesSoFar == nth) return index;
            index++;
        }
    }
    private boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(i -> number % i != 0);
    }
}