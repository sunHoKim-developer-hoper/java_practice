package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currnetIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        boolean result = currnetIndex < targetArr.length - 1;
        return result;
    }

    @Override
    public Integer next() {
        return targetArr[++currnetIndex];
    }
}
