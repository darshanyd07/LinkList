package com.bridgelabz_linklist;
import java.util.*;
public class LinkedListMain
{
    public static void main(String[] argv) throws Exception
    {
        try {

            LinkedList<Integer> list = new LinkedList<Integer>();

            // add some elements to list
            list.add(56);
            list.add(30);
            list.add(70);

            System.out.println("LinkedList : " + list);
            int value = list.element();
            System.out.println("Head of list : " + value);
        }
        catch (NullPointerException e)
        {
            System.out.println("Exception thrown : " + e);
        }
    }
}