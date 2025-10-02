package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        System.out.println("Removing Index  2..."+myLinkedList.remove(3));
        System.out.println("\nLinked List:");
        myLinkedList.printList();




    }
}
