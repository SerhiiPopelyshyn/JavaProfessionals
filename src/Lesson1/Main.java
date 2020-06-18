package Lesson1;

/*
Task 1
import java.util.Arrays;

public class Main {
    static <T> T[] swap(T[] arr, int idx1, int idx2) {
        if (idx1 < 0 || idx2 < 0 || idx1 >= arr.length || idx2 >= arr.length)
            throw new IllegalArgumentException("Èíäåêñ çà ïðåäåëàìè ìàññèâà");

        T o = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = o;
        return arr;
    }

    public static void main(String[] args) {
        String[] strings = {"i0", "i1", "i2"};
        strings = swap(strings, 1, 2);
        System.out.println(Arrays.deepToString(strings));
    }
}
 */

/*
Task 2
import java.util.ArrayList;

public class Main {
    static <E> ArrayList<E> arrayToArrayList(E[] array) {
        ArrayList<E> arrayList = new ArrayList();
        for (E element: array) {
            arrayList.add(element);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String[] strings = {"asdas", "dffdf", "33r3r"};
        ArrayList<String> stringArrayList = arrayToArrayList(strings);
        System.out.println(stringArrayList);
    }

}
 */


//Task 3
public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 4; i++) {
            orangeBox.add(new Orange());
        }
        System.out.println("Box with 4 oranges weigths " + orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 4; i++) {
            appleBox.add(new Apple());
        }
        System.out.println("Box with 4 apples weigths " + appleBox.getWeight());

        System.out.println("Compare boxes: " + appleBox.compare(orangeBox));

        Box<Apple> appleBox6 = new Box<>();
        for (int i = 0; i < 6; i++) {
            appleBox6.add(new Apple());
        }
        System.out.println("Compare 6 apples and 4 oranges boxes: " + appleBox6.compare(orangeBox));

        appleBox.move(appleBox6);
        System.out.println("After move box1 weigths: " + appleBox.getWeight());
        System.out.println("After move box2 weigths: " + appleBox6.getWeight());
    }
}