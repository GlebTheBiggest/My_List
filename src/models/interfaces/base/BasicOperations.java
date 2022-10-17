package models.interfaces.base;

import java.util.List;

public interface BasicOperations<T> {
    void add(T t);
    void addAll(List<Object> collection);
    T get(int index);
    void getAll();
    void delete(int index);
    int indexOf(T t);
}
