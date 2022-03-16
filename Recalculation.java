
public class Recalculation extends ListAndMap {
    static String action = Check.elements[1];
    public static int sum;

    public void arifmetic(int a, int b) { //арифметическое действие арабских чисел
        if (action.equals("+")) {
            sum = a + b;
        }
        if (action.equals("-")) {
            sum = a - b;
        }
        if (action.equals("*")) {
            sum = a * b;
        }
        if (action.equals("/")) {
            sum = a / b;
        }
    }

    public void arifmeticPom(int a, int b) throws Exception { //перевод суммы из арабских в римские цифры
        arifmetic(a, b);
        if (sum < 1) {
            throw new Exception("В римской системе нет отрицательных чисел");
        } else if (sum < 10) {
            System.out.println(numberRom.get(sum));
        } else {
            int a1 = sum / 10 * 10; //десятки
            int b2 = sum % 10;   //единицы
            System.out.println(numberRom.get(a1) + numberRom.get(b2));
        }
    }
}
