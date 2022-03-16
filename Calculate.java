public class Calculate {
    public static void count() throws Exception {
        Recalculation conversion = new Recalculation();
        if(Check.checkNumber()){//проверка является ли введенное арабскими числами
            conversion.arifmetic(Check.one, Check.two);//арифметическое действие арабских цифр
            System.out.println(Recalculation.sum);
        }else {
            conversion.arifmeticPom(Check.one, Check.two);}//перевод суммы из арабских в римские цифры

    }
}
