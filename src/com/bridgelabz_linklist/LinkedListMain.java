package com.bridgelabz_linklist;
import java.util.*;
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.show();
        System.out.println();
        list.insertAtMiddle(30);
        list.show();
        System.out.println();
        System.out.println();
        if(list.searchNode(30)) {
            System.out.println("serach key found");
        }
        else {
            System.out.println("serach key not found");
        }

        System.out.println();
        list.insertAtPosition(40, 3);
        list.show();

    }

}