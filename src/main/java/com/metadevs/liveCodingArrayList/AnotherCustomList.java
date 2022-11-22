package com.metadevs.liveCodingArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AnotherCustomList implements List<Integer> {

    public AnotherCustomList() {
        this.storage = new Integer[0];
    }

    Integer[] storage;

    @Override
    public int size() {
        return storage.length;
    }

    @Override
    public boolean isEmpty() {
        if (storage.length == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
            //НЕ ДЕЛАЕМ
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
            //НЕ ДЕЛАЕМ
        return null;
    }

    @Override
    public Object[] toArray() {
//        ЛЕГКИЙ
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
            //НЕ ДЕЛАЕМ
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        Integer[] newArray = new Integer[storage.length + 1];
        for (int i = 0; i < storage.length; i++) {
            newArray[i] = storage [i];
        }
        newArray [newArray.length-1] = integer;
        storage = newArray;
        return false;
    }

    @Override
    public boolean remove(Object o) {
//        СЛОЖНЫЙ
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        //НЕ ДЕЛАЕМ
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
//        СРЕДНИЙ
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
//        СЛОЖНЫЙ
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        //        СЛОЖНЫЙ
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        //НЕ ДЕЛАЕМ
        return false;
    }

    @Override
    public void clear() {
//         ЛЕГКИЙ
    }

    @Override
    public Integer get(int index) {
        //        ЛЕГКИЙ
//        Проверка на выход за пределы массива
        return null;
    }

    @Override
    public Integer set(int index, Integer element) {
        //        ЛЕГКИЙ
//        Проверка на выход за пределы массива
        return null;
    }

    @Override
    public void add(int index, Integer element) {
//        СЛОЖНЫЙ
    }

    @Override
    public Integer remove(int index) {
        //        СЛОЖНЫЙ
        return null;
    }

    @Override
    public int indexOf(Object o) {
        //        СРЕДНИЙ
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        //        СРЕДНИЙ
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        //НЕ ДЕЛАЕМ
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        //НЕ ДЕЛАЕМ
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
//        ЗАДАНИЕ СО ЗВЁЗДОЧКОЙ
        return null;
    }
}

//ПРОЧИТАТЬ ПРО БОКСИНГ И АНБОКСИНГ
//СРАВНЕНИЕ ПО ССЫЛКЕ И СРАВНЕНИЕ ПО ЗНАЧЕНИЮ