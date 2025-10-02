package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        System.out.println("Removing last from list...");
        myLinkedList.removeLast();
        System.out.println("After removing from list:");
        myLinkedList.printList();
        System.out.println("Removing last from list...");
        myLinkedList.removeLast();
        System.out.println("After removing from list:");
        myLinkedList.printList();
        System.out.println("Removing last from list...");
        myLinkedList.removeLast();
        System.out.println("After removing from list:");
        myLinkedList.printList();
        System.out.println("Removing last from list...");
        myLinkedList.removeLast();
        System.out.println("After removing from list:");
        myLinkedList.printList();





    }
}
