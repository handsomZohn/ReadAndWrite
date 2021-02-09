package com.book.datastructure.linkedlist;

import java.sql.DatabaseMetaData;

/**
 *@Description  ˫���б� java�汾ʵ��
 *@CreateDate 2021\2\9 0009 9:23
 *@Author z
 *@Version 1.0
 */
public class TwoWayLinkedList {

    // ����ͷ��
    private Node head;
    // ����β��
    private Node tail;
    // ������
    private int size;

    // �洢���ݵĽڵ�
    private class Node{
        // �ڵ�����
        private Object data;
        // ��һ���ڵ�
        private Node next;
        // ��һ���ڵ�
        private Node prev;
        public Node(Object data) {
            this.data = data;
        }
    }

    public TwoWayLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * ����ͷ�� ����ڵ�
     * @param value
     */
    public void addHead(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size ++;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size ++;
        }
    }

    /**
     * ����β�� ���ӽڵ�
     * @param value
     */
    public void addTail(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size ++;
    }

    /**
     * ɾ�������ͷ���ڵ�
     * @return
     */
    public Node deleteHead() {
        Node temp = head;
        if (size != 0) {
            head = head.next;
            head.prev = null;
            size --;
            return temp;
        } else {
            return null;
        }
    }

    /**
     * ɾ�������β���ڵ�
     * @return
     */
    public Node deleteTail() {
        Node temp = tail;
        if (size == 0) {
            tail = tail.prev;
            tail.next = null;
            size --;
            return temp;
        } else {
            return null;
        }
    }
}
