import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagramms_checker {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.println("Введите первое слово");
                String wordOne = bufferedReader.readLine().toLowerCase();
                System.out.println("Введите второе слово");
                String wordTwo = bufferedReader.readLine().toLowerCase();
                checkWords(wordOne, wordTwo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkWords(String wordOne, String wordTwo) {
        if (wordOne.length() == wordTwo.length()) {
            char[] arrayWordOne = wordOne.toCharArray();
            char[] arrayWordTwo = wordTwo.toCharArray();
            Arrays.sort(arrayWordOne);
            Arrays.sort(arrayWordTwo);
            int count = 0;
            for (int i = 0; i < arrayWordOne.length; i++) {
                if (arrayWordOne[i] == arrayWordTwo[i]) {
                    count++;
                    if (count == arrayWordOne.length) {
                        System.out.println("Данные слова анаграммы");
                    }
                } else {
                    count = 0;
                    System.out.println("Данные слова не анаграммы");
                    break;
                }
            }
            count = 0;
            System.out.println("");
        } else {
            System.out.println("Данные слова не анаграммы");
            System.out.println("");
        }
    }
}