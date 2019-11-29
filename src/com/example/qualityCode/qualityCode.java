package com.example.qualityCode;
import com.example.qualityCode.LinkedList;
import com.example.qualityCode.Cellule;

public class qualityCode {

    public static void main(String[] args) {

        Cellule gerard = new Cellule("Gérard");
        Cellule ginette = new Cellule("Ginette");
        Cellule michel = new Cellule("Michel");
        Cellule jean = new Cellule("Jean");

        LinkedList<String> queue = new LinkedList<String>(gerard);

        queue.pushElementToQueueList(ginette);
        queue.pushElementToFrontList(michel);

        queue.pushElementToPosition(jean, 1);

        queue.ShowListContent();

        System.out.print("\n");

        queue.deleteElementFromPosition(2);

        //queue.deleteElement(jean);

        queue.ShowListContent();

    }

}
