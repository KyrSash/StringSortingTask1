package StringSortingTask;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    String string;

    public WordCount(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private int getWordCount(String string) {    // Находим количество слов в строке
        int count = 0;

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private String[] getSortedArrayAlphabetically(String string) {     // Заносим каждое слово строки в ячейку массива и
        String stringLowerCase = string.toLowerCase();                 // сортируем массив по алфавиту
        String[] strArray = new String[getWordCount(stringLowerCase)];
        int count = 0;

        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(stringLowerCase);

        while (matcher.find()) {
            strArray[count] = stringLowerCase.substring(matcher.start(), matcher.end());
            count++;
        }
        Arrays.sort(strArray);
        return strArray;
    }


    public void getNumberWordsInAlphabeticalOrder(String string) {
        String[] strArray = getSortedArrayAlphabetically(string);
        int count;

        for (int i = 0; i < strArray.length - 1; i += count) {
            if (strArray[i].charAt(0) != strArray[i + 1].charAt(0)) {
                System.out.print(strArray[i].charAt(0) + ": " + "\t");
                //System.out.print((char) (i + 65) + ": " + "\t");
            }

            System.out.print(strArray[i] + " ");
            count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    count++;
                } else break;
            }
            System.out.println(count);
        }
    }
}

