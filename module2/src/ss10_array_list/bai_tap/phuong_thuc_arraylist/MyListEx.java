package ss10_array_list.bai_tap.phuong_thuc_arraylist;

import java.util.Arrays;

public class MyListEx<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyListEx() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyListEx(int capacity) {
        if (capacity >= 0 ) {
            element = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public E remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("Không có vị trí index:" + index);
        }
        E elements = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;
    }

    public void add(E elements, int index) {
        if (size == element.length) {
            ensureCapacity(10);
        }
        for (int i = size - 1; i >= index; i--) {
            element[i] = element[i - 1];
        }
        element[index] = elements;
        size++;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];

    }

    public int size() {
        return this.size;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = element.length + minCapacity;
        element = Arrays.copyOf(element, newSize);
    }

    public void clear(){
        this.size = 0;
        for (int index = 0; index < element.length; index++) {
            element[index] = null;
        }
    }
    public void add(E e) {
        if (size == element.length) {
            ensureCapacity(10);
        }
        element[size++] = e;

    }

    @Override
    public String toString() {
        return "MyListEx{" +
                "element=" + Arrays.toString(element) +
                '}';
    }
}
