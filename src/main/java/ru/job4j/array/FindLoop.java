package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        if (start >= 0 && start < data.length && finish >= 0 && finish < data.length && start <= finish) {
            for (int index = start; index <= finish; index++) {
                if (data[index] == el) {
                    rst = index;
                    break;
                }
            }
        }
        return rst;
    }
}
