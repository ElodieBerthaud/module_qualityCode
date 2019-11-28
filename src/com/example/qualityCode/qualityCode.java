package com.example.qualityCode;
import com.example.qualityCode.LinkedList;
import com.example.qualityCode.Cellule;

public class qualityCode {

    public static void main(String[] args) {

        Cellule gerard = new Cellule("Gérard");
        Cellule ginette = new Cellule("Ginette");
        Cellule michel = new Cellule("Michel");

        LinkedList<String> queue = new LinkedList<String>(gerard);

        queue.pushElementToQueueList(ginette);
        queue.pushElementToFrontList(michel);

        queue.ShowListContent();
    }

}
