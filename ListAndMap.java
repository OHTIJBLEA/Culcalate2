import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListAndMap {  //отдельный класс для хранения аррейлиста и хэшмапа

    public static List list = new ArrayList();
    public static HashMap<Integer, String> numberRom = new HashMap<>();

    public void info() {
        list.add(null);
        list.add("I");
        list.add("II");
        list.add("III");
        list.add("IV");
        list.add("V");
        list.add("VI");
        list.add("VII");
        list.add("VIII");
        list.add("IX");
        list.add("X");

        numberRom.put(0, "");
        numberRom.put(1, "I");
        numberRom.put(2, "II");
        numberRom.put(3, "III");
        numberRom.put(4, "IV");
        numberRom.put(5, "V");
        numberRom.put(6, "VI");
        numberRom.put(7, "VII");
        numberRom.put(8, "VIII");
        numberRom.put(9, "IX");
        numberRom.put(10, "X");
        numberRom.put(20, "XX");
        numberRom.put(30, "XXX");
        numberRom.put(40, "XL");
        numberRom.put(50, "L");
        numberRom.put(60, "LX");
        numberRom.put(70, "LXX");
        numberRom.put(80, "LXXX");
        numberRom.put(90, "CX");
        numberRom.put(100, "C");
    }
}
