package com.example.qualityCode;
import com.example.qualityCode.Cellule;

public class LinkedList<T> {
    private Cellule<T>      node;

    LinkedList(Cellule<T> node) {
        if (node != null){
            this.node = node;
            this.node.nextData = null;
        } else {
            this.node = null;
        }
    }

    public int ShowListContent(){
        Cellule<T> ListIterator = this.node;

        if (this.node != null){
            while (ListIterator.nextData != null) {
                System.out.print(ListIterator.data.toString() + " ");
                ListIterator = ListIterator.nextData;
            }
            System.out.print(ListIterator.data.toString());
            return 0;
        }
        return -1;
    }

    public int pushElementToFrontList(Cellule<T> node){

        if (node != null){
            if (this.node == null){
                this.node = node;
                node.nextData = null;
                return 0;
            }
            node.nextData = this.node;
            this.node = node;
            return 0;
        }
        return -1;
    }

    public int pushElementToQueueList(Cellule<T> node){
        Cellule<T> ListIterator = this.node;

        if (node != null) {
            if (this.node == null){
                this.node = node;
            } else {
                while (ListIterator.nextData != null) {
                    ListIterator = ListIterator.nextData;
                }
                ListIterator.nextData = node;
            }
            node.nextData = null;
            return 0;
        }
        return -1;
    }

    private void assignNode(Cellule<T> node, Cellule<T> tmpNode){
        node.nextData = tmpNode.nextData;
        tmpNode.nextData = node;
    }

    public int pushElementToPosition(Cellule<T> node, int position){
        int i = 0;
        Cellule<T> ListIterator = this.node;

        if (position == 1){
            pushElementToFrontList(node);
            return 0;
        } else if (position > 1) {
            while (ListIterator.nextData != null) {
                if ((i + 1) == position) {
                    assignNode(node, ListIterator);
                    return 0;
                }
                ListIterator = ListIterator.nextData;
                i++;
            }
            assignNode(node, ListIterator);
        }
        return -1;
    }

    public int deleteElementFromPosition(int position){
        int i = 1;
        Cellule<T> ListIterator = this.node;

        if (position == 1){
            this.node = this.node.nextData;
            return 0;
        } else if (position > 1){
            while (ListIterator.nextData != null) {
                if ((i + 1) == position) {
                    ListIterator.nextData = ListIterator.nextData.nextData;
                    return 0;
                }
                ListIterator = ListIterator.nextData;
                i++;
            }
        }
        return -1;
    }
}
