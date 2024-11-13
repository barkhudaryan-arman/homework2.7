import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        // Используем TreeSet, чтобы удалить дубликаты и автоматически отсортировать числа
        Set<Integer> evenNumbers = new TreeSet<>();

        for (int num : nums2) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        for (int num : evenNumbers) {
            System.out.println(num);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi", "apple");

        // Используем HashSet для хранения уникальных слов
        Set<String> uniqueWords = new HashSet<>(words);

        // Выводим уникальные слова в консоль
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        // Используем HashMap для хранения слов и их количества
        Map<String, Integer> wordCount = new HashMap<>();

        // Подсчитываем количество каждого слова
        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим количество дублей для каждого уникального слова
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            int duplicates = entry.getValue() - 1; // Вычисляем количество дублей
            System.out.println("Слово: \"" + entry.getKey() + "\", количество дублей: " + duplicates);
        }
    }
}


