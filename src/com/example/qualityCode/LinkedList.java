package com.example.qualityCode;
import com.example.qualityCode.Cellule;

public class LinkedList<T> {
    private Cellule<T>      node;

    LinkedList(Cellule<T> node) {
        this.node = node;
        this.node.nextData = null;
    }

    public void ShowListContent(){
        Cellule<T> ListIterator = this.node;

        while (ListIterator.nextData != null) {
            System.out.print(ListIterator.data.toString() + " ");
            ListIterator = ListIterator.nextData;
        }
        System.out.print(ListIterator.data.toString());
    }

    public void pushElementToFrontList(Cellule<T> node){
        node.nextData = this.node;
        this.node = node;
    }

    public void pushElementToQueueList(Cellule<T> node){
        Cellule<T> ListIterator = this.node;

        while (ListIterator.nextData != null) {
            ListIterator = ListIterator.nextData;
        }
        ListIterator.nextData = node;
        ListIterator.nextData.nextData = null;
    }
}