package models.interfaces.service;

public interface ServiceOperations<T> {
    int size();
    void clear();
    boolean contains(T t);
    boolean isEmpty();
    int indexOf(T t);
    void set(int index, T t);
}
