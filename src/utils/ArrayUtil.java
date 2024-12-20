package utils;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static void removeElement(Object[] list, int index) {
        checkValidArrayLength(list, index);
        checkArrayLength(list, index);
        for (int i = index; i < list.length; i++) {
            list[i] = list[i + 1];
        }
        list[list.length - 1] = null;

    }

    public static void checkValidArrayLength(Object[] list, int index) {
        if (index >= list.length || index < 0) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public static void checkArrayLength(Object[] list, int index) {
        if (list.length == 1) {
            list[0] = null;
        }
    }
}
