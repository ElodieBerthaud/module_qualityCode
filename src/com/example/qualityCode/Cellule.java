package com.example.qualityCode;

public class Cellule<T> {
    public T   data;
    public Cellule<T>  nextData;

    Cellule(T data){
        this.data = data;
        this.nextData = null;
    }
}
