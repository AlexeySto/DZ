public class Printer {
    public static void main(String[] args) {
        String name1 = "Ivanov";
        String name2 = "Petrov";
        String name3 = "Sidorov";
        int phone1 = 123456;
        int phone2 = 654321;
        int phone3 = 242845;
        int phone4 = 572586;
        int phone5 = 256357;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name3, phone5);
        myPhoneBook.add(name2, phone5);
        myPhoneBook.add(name1, phone3);
        myPhoneBook.add(name1, phone4);

        System.out.println(PhoneBook.getPhoneBook());
    }
}