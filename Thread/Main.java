package Thread;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        ArrayList<Integer> combinedOddNumbers = new ArrayList<>();
        ArrayList<Integer> combinedEvenNumbers = new ArrayList<>();

        int chunkSize = 2500;

        Runnable oddThread = () -> {
            for (int i = 0; i < chunkSize; i++) {
                int num = numbers.get(i);
                if (num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }
            combinedOddNumbers.addAll(oddNumbers);
        };

        Runnable evenThread = () -> {
            for (int i = chunkSize; i < 2 * chunkSize; i++) {
                int num = numbers.get(i);
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                }
            }
            combinedEvenNumbers.addAll(evenNumbers);
        };

        Runnable oddThread2 = () -> {
            for (int i = 2 * chunkSize; i < 3 * chunkSize; i++) {
                int num = numbers.get(i);
                if (num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }
            combinedOddNumbers.addAll(oddNumbers);
        };

        Runnable evenThread2 = () -> {
            for (int i = 3 * chunkSize; i < 4 * chunkSize; i++) {
                int num = numbers.get(i);
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                }
            }
            combinedEvenNumbers.addAll(evenNumbers);
        };

        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);
        Thread thread3 = new Thread(oddThread2);
        Thread thread4 = new Thread(evenThread2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Odd numbers: " + combinedOddNumbers);
        System.out.println("Even numbers: " + combinedEvenNumbers);
    }
}
