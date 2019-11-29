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

//    public void deleteElement(Cellule<T> Element){
//        Cellule<T> ListIterator = this.node;
//
//        if (Element == this.node){
//            Element.nextData = ListIterator.nextData;
//            this.node = Element;
//            return;
//        }
//        while (ListIterator.nextData != Element) {
//            ListIterator = ListIterator.nextData;
//        }
//        ListIterator.nextData = ListIterator.nextData.nextData;
//    }

    private void assignNode(Cellule<T> node, Cellule<T> tmpNode){
        node.nextData = tmpNode.nextData;
        tmpNode.nextData = node;
    }

    public void pushElementToPosition(Cellule<T> node, int position){
        int i = 0;
        Cellule<T> ListIterator = this.node;

        if (position == 1){
            pushElementToFrontList(node);
        } else if (position > 1) {
            while (ListIterator.nextData != null) {
                if ((i + 1) == position) {
                    assignNode(node, ListIterator);
                    return;
                }
                ListIterator = ListIterator.nextData;
                i++;
            }
            assignNode(node, ListIterator);
        }
    }

    public void deleteElementFromPosition(int position){
        int i = 1;
        Cellule<T> ListIterator = this.node;

        if (position == 1){
            this.node = this.node.nextData;
        } else {
            while (ListIterator.nextData != null) {
                if ((i + 1) == position) {
                    ListIterator.nextData = ListIterator.nextData.nextData;
                    return;
                }
                ListIterator = ListIterator.nextData;
                i++;
            }
        }
    }
}
