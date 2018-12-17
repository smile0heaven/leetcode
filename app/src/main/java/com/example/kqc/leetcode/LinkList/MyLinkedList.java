package com.example.kqc.leetcode.LinkList;

/**
 * Created by yq
 * Date  on : 2018/10/15
 */
public class MyLinkedList {
    int val;
    MyLinkedList next;
    MyLinkedList head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (head == null) return -1;
        if (index == 0) return head.val;
        MyLinkedList list = head;
        for (int i = 0; i < index; i++) {
            if (list.next != null)
                list = list.next;
            else
                return -1;
        }
        return list.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyLinkedList list = new MyLinkedList();
        list.val = val;
        list.next = head;
        head = list;


    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyLinkedList list = new MyLinkedList();
        list.val = val;
        list.next = null;
        if (head == null) {
            head = list;
            return;
        }
        MyLinkedList myList = head;
        while (myList.next != null) {
            myList = myList.next;
        }
        myList.next = list;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (head == null)
            if (index == 0) {
                addAtHead(val);
                return;
            } else return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        MyLinkedList myList = head;
        for (int i = 0; i < index - 1; i++) {
            if (myList.next == null) return;
            myList = myList.next;
        }
        MyLinkedList list = new MyLinkedList();
        list.val = val;
        list.next = myList.next;
        myList.next = list;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
                return;
            }
        }
        MyLinkedList myList = head;
        for (int i = 0; i < index - 1; i++) {
            if (myList.next == null) return;
            myList = myList.next;
        }
        if (myList.next != null) myList.next = myList.next.next;
    }

    public void print() {
        MyLinkedList myList = head;
        while (myList != null) {
            System.out.print(myList.val + "+");
            myList = myList.next;
        }
        System.out.println("");

    }
}