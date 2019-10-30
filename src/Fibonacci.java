public class Fibonacci {

    /*
    Following the fibonacci pattern,
    F0 = 0
    F1 = 1
    Fn = Fn-1 + Fn - 2
    Calls back recursively onto method making time complexity O(2^n).
     */
    public static int recursiveFib(int term) {
        if (term <= 0) return 0;
        if (term == 1) return 1;

        return recursiveFib(term - 1) + recursiveFib(term - 2);
    }

    /*
    Similarly to above, but stores the two previous terms to add
    meaning it continues linearly (Will run term - 1 time) = O(n);
     */
    public static int linearFib(int term) {
        int first = 0;
        int second = 1;
        int current = 1;

        for (int i = 1; i < term; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int termToFind = 10;
        int recursiveFib = 0;
        int linearFib = 0;

        Long startTime = System.currentTimeMillis();
        recursiveFib = recursiveFib(termToFind);
        Long endTime = System.currentTimeMillis();
        System.out.println("Finding the " + termToFind + "th term RECURSIVELY took: " + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        linearFib = linearFib(termToFind);
        endTime = System.currentTimeMillis();
        System.out.println("Finding the " + termToFind + "th term Linearly took: " + (endTime - startTime) + "ms");

        termToFind = 20;
        startTime = System.currentTimeMillis();
        recursiveFib = recursiveFib(termToFind);
        endTime = System.currentTimeMillis();
        System.out.println("Finding the " + termToFind + "th term RECURSIVELY took: " + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        linearFib = linearFib(termToFind);
        endTime = System.currentTimeMillis();
        System.out.println("Finding the " + termToFind + "th term Linearly took: " + (endTime - startTime) + "ms");

        termToFind = 50;
        startTime = System.currentTimeMillis();
        recursiveFib = recursiveFib(termToFind);
        endTime = System.currentTimeMillis();
        System.out.println("Finding the " + termToFind + "th term RECURSIVELY took: " + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        linearFib = linearFib(termToFind);
        endTime = System.currentTimeMillis();
        System.out.println("Finding the " + termToFind + "th term Linearly took: " + (endTime - startTime) + "ms");
    }
}
