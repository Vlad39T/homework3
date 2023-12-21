package homework3_30.homework2526.servece;

import homework3_30.homework2526.db.DefaultDictionary;
import homework3_30.homework2526.model.Dictionary;

import java.util.*;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private homework3_30.homework2526.model.Dictionary dictionary;
    private Map<String, Integer> count;

    public Map<String, Set<String>> getDictionary() {
        return dictionary.getDictionary();
    }

    public Metods() {
        dictionary = new Dictionary();
        defaultDictionary = new DefaultDictionary();
        dictionary.getDictionary().putAll(defaultDictionary.defaultVocabulary());
        count = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dictionary.getDictionary().containsKey(word)) {
            Set<String> translateSet = new HashSet<>();
            translateSet.add(translation);
            dictionary.getDictionary().put(word, translateSet);
            System.out.println("Слово додано " + word);
        } else {
            System.out.println("Переклад вже існує");
        }
        count.put(word, count.getOrDefault(word, 0) + 1);
    }

    public void show(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
            System.out.print(word + " - ");
            for (String translation : dictionary.getDictionary().get(word)) {
                System.out.println(translation);
            }
        } else {
            System.out.println("Нічого не знайдено");
        }
    }

    public void changeTranslation(String word, String oldT, String newT) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> translationSet = dictionary.getDictionary().get(word);
            if (translationSet.contains(oldT)) {
                translationSet.remove(oldT);
                translationSet.add(newT);
                System.out.println("Переклад змінено" + word);
            } else {
                System.out.println("Вказаний переклад не знайдено");
            }
        } else {
            System.out.println("Слово не знайдено в словарі");
        }
    }

    public void addTranslation(String word, String translation) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> add = dictionary.getDictionary().get(word);
            add.add(translation);
            System.out.println("Переклад додано" + word);
        } else {
            System.out.println("Слово в словарі не знайдено");
        }
    }

    public void deleteTranslation(String word, String translation) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> delete = dictionary.getDictionary().get(word);
            delete.remove(translation);
        } else {
            System.out.println("Слово в словнику не знайдено ");
        }
    }

    public void addWord(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
            dictionary.getDictionary().put(word, new HashSet<>());
            System.out.println("Слово додане" + word);
        } else {
            System.out.println("Слово не було знайдене в словарі");
        }
    }

    public void changeWord(String word, String newW) {
        if (dictionary.getDictionary().containsKey(word)) {
            Set<String> change = dictionary.getDictionary().remove(word);
            dictionary.getDictionary().put(newW, change);
            System.out.println("Слово змінено");
        } else {
            System.out.println("Слово не було знайдено");
        }
    }

    public void deleteWord(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
            dictionary.getDictionary().remove(word);
            System.out.println("Слово було видалено");
        } else {
            System.out.println("Слово не було знайдено");
        }
    }

    public void showDictionary() {
        for (Map.Entry<String, Set<String>> entry : dictionary.getDictionary().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public void top10up() {
        List<Map.Entry<String, Integer>> top = new ArrayList<>(count.entrySet());
        top.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int count = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : top) {
            System.out.println(stringIntegerEntry.getKey() + "кількість запросів = " + stringIntegerEntry.getValue());
            count++;
            if (count >= 10) {
                break;
            }
        }
    }

    public void top10down() {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(count.entrySet());
        sortedWords.sort(Comparator.comparing(Map.Entry::getValue));
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " - Кількість входжень: " + entry.getValue());
            count++;
            if (count >= 10) {
                break;
            }
        }
    }

}
