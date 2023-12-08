package hello;

import java.util.ArrayList;

public class SomeMoreTesting {

    private int size;
    private int capacity;
    private String[] elements;

    public SomeMoreTesting() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] new_array = new String[(int) (capacity * 1.5)];
        for(int i = 0; i < elements.length - 1; i++ ){
            new_array[i] = elements[i];
        }
        elements = new_array;
    }

}
