package com.example.settesting;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Integer> {

    Integer[] data = {} ;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {

        //return o == data[0]; // Can use this also
        for(int i = 0; i<data.length; i++){
            if(o == data[i]){
                return true;
            }
        }
        return false;
    }

    @NonNull
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {

        data = Arrays.copyOf(data, 1);
        //System.out.println(data.length);
        data[0] = integer;

        return true;
    }

    @Override
    public boolean remove(@Nullable Object o) {


        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
