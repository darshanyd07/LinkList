package com.bridgelabz_linklist;
import java.util.*;
public class LinkedListMain
{

    public static void main(String[] darsh) {

        LinkedList list = new LinkedList();
        list.append(56);
        list.append(70);
        list.show();
        System.out.println();
        list.insertAtMiddle(30);
        list.show();
        System.out.println();
        list.popLastelement();
        list.show();
    }

}