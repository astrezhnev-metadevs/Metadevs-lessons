package com.metadevs.liveCodingArrayList;

import java.util.*;

public class CustomList implements List<Integer>{
  private List<Integer> storage = new ArrayList<>();


  @Override
  public int size() {
    return storage.size();
  }

  @Override
  public boolean isEmpty() {
    return storage.contains(1) || storage.isEmpty();
  }

  @Override
  public boolean contains(Object o) {
    boolean matched = false;
    for (int i : storage) {
      if (o instanceof Integer){
        matched = i == (Integer)o;
      }
      if (matched){
        break;
      }
    }
    return matched;
  }

  @Override
  public Iterator<Integer> iterator() {
    return storage.iterator();
  }

  @Override
  public Object[] toArray() {
    return storage.toArray();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return storage.toArray(a);
  }

  @Override
  public boolean add(Integer integer) {
    return storage.add(integer);
  }

  @Override
  public boolean remove(Object o) {
    return storage.remove(o);
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Integer> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends Integer> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public Integer get(int index) {
    return null;
  }

  @Override
  public Integer set(int index, Integer element) {
    return null;
  }

  @Override
  public void add(int index, Integer element) {

  }

  @Override
  public Integer remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<Integer> listIterator() {
    return null;
  }

  @Override
  public ListIterator<Integer> listIterator(int index) {
    return null;
  }

  @Override
  public List<Integer> subList(int fromIndex, int toIndex) {
    return null;
  }
}



