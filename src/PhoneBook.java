import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phones = phoneBook.get(name);
            phones.add(phoneNum);
        } else {
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phoneNum);
            phoneBook.putIfAbsent(name, phones);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return  new ArrayList<>();
        }

    }

    public static LinkedHashMap<String, ArrayList<Integer>> getPhoneBook() {
        LinkedHashMap<String, ArrayList<Integer>> sortedMap = phoneBook.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue().size()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        return sortedMap;

    }
}
