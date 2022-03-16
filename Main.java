import java.util.Scanner;

public class Main {
    public static String primer = "Пример: \"3 + 4\"  или \"V * X\".";

    public static void main(String[] args) throws Exception {
        //запуск программы, просьба ввести пример по образцу
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Введите пример с арабскими или римскими цифрами от 1 до 10. \n" + primer);

        //перевод ввода в заглавные(для удобства ввода)
        String number = inputNumbers.nextLine().toUpperCase();

        //проверка ввода на правильность, при ошибке выбросит исключение
        Check.checkEverything(number);

        // просчет
        Calculate.count();
    }


}
