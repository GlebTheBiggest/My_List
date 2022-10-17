package models.myList;

import models.interfaces.base.BasicOperations;
import models.interfaces.service.ServiceOperations;

import java.util.List;

public class MyArrayList<T> implements BasicOperations<T>, ServiceOperations<T> {
    private Object[] array;
    private int counter = 0;

    public MyArrayList() {
        this.array = new Object[1];
    }

    private void setArray(T[] array) {
        this.array = array;
    }

    private T[] positiveMaker(T[] array) {
        int size = array.length + 1;
        T[] arr = (T[]) new Object[size];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    private T[] negativeMaker(T[] array) {
        int size = array.length - 1;
        T[] arr = (T[]) new Object[size];
        for (int i = 0; i < array.length - 1; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    private boolean checker(Object[] array) {
        int counterOfNULL = 0;
        for (Object o : array) {
            if (o == null) {
                counterOfNULL++;
            }
        }
        return counterOfNULL == 0;
    }

    @Override
    public void add(T t) {
        if (checker(array)) {
            setArray(positiveMaker((T[]) array));
        }
        array[counter] = t;
        counter++;
    }

    @Override
    public void addAll(List collection) {
        T[] arr = (T[]) new Object[collection.size()];
        setArray(arr);
        for (int i = 0; i < collection.size(); i++) {
            array[i] = (T) collection.get(i);
            if (checker(array)) {
                setArray(positiveMaker((T[]) array));
            }
        }
        counter = collection.size();
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void getAll() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println((i + 1) + ". " + array[i]);
            } else {
                break;
            }
        }
    }

    @Override
    public void delete(int index) {
        for (int i = index; i < array.length; i++) {
            if (i + 1 == array.length) {
                break;
            } else {
                array[i] = array[i + 1];
            }
        }
        setArray(negativeMaker((T[]) array));
        counter--;
    }

    @Override
    public int size() {
        if (array[0] == null)
        {
            return 0;
        }
        else {
            return counter;
        }
    }

    @Override
    public void clear() {
        setArray((T[]) new Object[1]);
        counter = 0;
    }

    @Override
    public boolean contains(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }

    @Override
    public int indexOf(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == t) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void set(int index, T t) {
        array[index] = t;
    }
}
