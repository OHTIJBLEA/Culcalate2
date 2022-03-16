public class Check {
    public static String[] elements;
    public static int one;
    public static int two;

    public static void checkEverything(String input) throws Exception {
        makeElements(input); //создание массива
        veridyCount(elements);//проверка на правильность ввода примера
        checkZnak();//проверка массива на знак
        if (checkInt1() ^ checkInt2()) { //проверка ввода сразу римских и арабских цифр
            throw new Exception("Вводите только римские или только целые арабские цифры.");
        }
        try {
            checkOneToTen(); //проверка от 0 до 10
            translationInt2();//перевод арабских в инт
        } catch (Exception e) {
            checkRom();//проверка ввода римских цифр от I до X
            translationInt();//перевод римских в арабские
        }
    }

    //создание массива из ввода
    public static void makeElements(String input) {
        elements = input.split(" ");
    }

    //ПРОВЕРКА МАССИВА
    private static void veridyCount(String[] elements) throws Exception {
        if (elements.length != 3) {
            throw new Exception("Вы ввели неверное число элементов \n" + Main.primer);
        }
    }

    //ПРОВЕРКА АРИФМЕТИЧЕСКОГО ЗНАКА
    public static void checkZnak() throws Exception {
        String action = elements[1]; // знак действия
        if (!(action.equals("+") | action.equals("-") | action.equals("*") | action.equals("/"))) {
            throw new Exception("Проверьте знак арифметического действия. \n" + Main.primer);
        }
    }

    //проверка ввода римских цифр от I до X
    public static void checkRom() throws Exception {
        ListAndMap listAndMap = new ListAndMap();
        listAndMap.info();
        boolean a = ListAndMap.list.contains(elements[0]);
        boolean b = ListAndMap.list.contains(elements[2]);
        if (a & b) {
        } else throw new Exception("Введите существующие римские цифры от I до X");
    }

    //проверка от 0 до 10
    private static void checkOneToTen() throws Exception {
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        if (a < 0 | a > 10 | b < 0 | b > 10) {
            throw new Exception("Вводите цифры от 0 до 10");
        }
    }

    //проверка булен на цифры
    public static boolean checkNumber() {
        try {
            int a = Integer.parseInt(elements[0]);
            int b = Integer.parseInt(elements[2]);
            return true;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    //проверка 0 массива на число
    public static boolean checkInt1() {
        try {
            int a = Integer.parseInt(elements[0]);
            return true;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    //проверка 2 массива на число
    public static boolean checkInt2() {
        try {
            int a = Integer.parseInt(elements[2]);
            return true;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    //перевод римских в арабские
    public static void translationInt() {
        one = ListAndMap.list.indexOf(elements[0]);
        two = ListAndMap.list.indexOf(elements[2]);
    }

    //перевод арабских в инт
    private static void translationInt2() {
        one = Integer.parseInt(elements[0]);
        two = Integer.parseInt(elements[2]);
    }
}