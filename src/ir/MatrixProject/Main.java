package ir.MatrixProject;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {76,90,78,45,78,67,90,34,99,23};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }
        System.out.println(largest);
        System.out.println(smallest);
        System.out.println(largest + smallest);

    }
}
