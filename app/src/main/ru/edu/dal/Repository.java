package ru.edu.dal;

/**
 * An interface to access storage layer
 * @param <I> type identifier
 * @param <E> type entity
 */
public interface Repository<I, E> {

    E get(I key);

    void put(I key, E value);

    void remove(I key);
}
