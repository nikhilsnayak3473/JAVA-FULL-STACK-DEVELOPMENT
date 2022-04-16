package basics;

class OddNumbers {
    public static void main(String[] args) {
        printOddNumbers(20, 50);
    }

    private static void printOddNumbers(int start, int end) {
        int i;
        for (i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}


