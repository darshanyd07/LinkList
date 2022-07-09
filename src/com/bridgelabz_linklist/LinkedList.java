package com.bridgelabz_linklist;
public class LinkedList
{

    Node head;
    Node tail;

    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void show()
    {
        Node  temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public void append(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

}
class Node
{

    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
    Ability to create Linked
    List by appending 30 and
        70 to 56