package com.example.qualityCode;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class LinkedListTest<T> {

    @Test
    public void showListContent() {
        Cellule<String>  node = null;
        LinkedList<String>  list = new LinkedList<>(node);
        int expected = -1;
        int actual = list.ShowListContent();

        assertEquals(expected, actual);
    }

    @Test
    public void pushNullElementToFrontList(){
        Cellule<String>  node = new Cellule<String>("Gérard");
        LinkedList<String>  list = new LinkedList<>(node);
        int expected = -1;
        int actual = list.pushElementToFrontList(null);

        assertEquals(expected, actual);
    }

    @Test
    public void pushNullElementToQueueList(){
        Cellule<String>  node = new Cellule<String>("Gérard");
        LinkedList<String>  list = new LinkedList<>(node);
        int expected = -1;
        int actual = list.pushElementToQueueList(null);

        assertEquals(expected, actual);
    }

    @Test
    public void pushElementToOutPosition() {
        Cellule<String>  ginette = new Cellule<String>("Ginette");
        LinkedList<String>  list = new LinkedList<>(ginette);
        int expected = -1;
        int actual = list.pushElementToPosition(ginette, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void deleteElementFromOutPosition() {
        Cellule<String>  ginette = new Cellule<String>("Ginette");
        LinkedList<String>  list = new LinkedList<>(ginette);
        int expected = -1;
        int actual = list.deleteElementFromPosition(2);

        assertEquals(expected, actual);
    }
}