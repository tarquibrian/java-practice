import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String myStringValue = "first string";
        System.out.println(myStringValue);

        int myIntValue = 1;
        myIntValue = myIntValue + 13;
        System.out.println(myIntValue);

        Integer myIntegerValue = 24;
        System.out.println(myIntegerValue);

        boolean myBooleanValue = true;

        if (myBooleanValue) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        List myList = new ArrayList();
        myList.add("hola");
        System.out.println(myList);

        Main myMain = new Main();
        System.out.println(myMain.sumaNumeros(3,31));

    }

    public int sumaNumeros(int int1, int int2) {
        return int1 + int2;
    }

}