package task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Создаете коллекцию, ввести с клавиатуры 25 чисел. Выводите коллекцию на экран без сортировки.
 * Делаете Quick Sort и выводите после сортировки.
 * Вводите 100 чисел через рандом, 0..1000, Insertion Sort.
 * Покрыть Юнит тестами.
 * Make lists, not war.
 */

public class InsertionAndQuickSort {

    private String userInput;
    private ArrayList<Integer> inputNumbers;

    public static void main(String[] args) {

        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            InsertionAndQuickSort sortion = new InsertionAndQuickSort();

            sortion.getInputNumbers(input);
            sortion.makeInsertionSort(sortion.inputNumbers);

            /* add quick sort */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getInputNumbers(BufferedReader reader) {
        InsertionAndQuickSort sort = new InsertionAndQuickSort();
        System.out.println("Введите 25 чисел: ");
        for (int i = 25; i > 0; i--) {
            try {
                sort.userInput = reader.readLine().replaceAll("[^\\d.]", "");
            } catch (IOException e) {
                System.err.println("Error in number input occurred.");
                e.printStackTrace();
            }
            sort.inputNumbers.add(Integer.parseInt(sort.userInput));
            System.out.println("Осталось " + (i - 1));
        }
        System.out.println("\nНеотсортированный список чисел: " + sort.inputNumbers.toString());
    }

    void makeInsertionSort(ArrayList<Integer> numbers) {

        int temp;
        int sortInterator;

        System.out.println("\nСотритровка методом вставки.");
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                temp = numbers.get(i + 1);
                numbers.set(i + 1, numbers.get(i));
                numbers.set(i, temp);
                sortInterator = i;
                while (sortInterator > 0 && temp < numbers.get(sortInterator - 1)) {
                    numbers.set(sortInterator, numbers.get(sortInterator - 1));
                    sortInterator--;
                }
                numbers.set(sortInterator, temp);
            }
        }
        System.out.println("Отсотритрованный список чисел методом вставки: " + numbers.toString());
    }
}                                                                                                                                                                                                                                                                        