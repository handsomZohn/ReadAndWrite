package com.book.datastructure.linkedlist;


/**
 * @Description �����б�javaʵ��
 * @CreateDate 2021\2\8 0008 14:00
 * @Author z
 * @Version 1.0
 */
public class SingleLinkedList {
    /**
     * ����ڵ�ĸ���
     */
    private int length;

    /**
     * ͷ�ڵ�
     */
    private Node head;

    public SingleLinkedList() {
        length = 0;
        head = null;
    }

    private class Node {
        /**
         * ÿ���ڵ������
         */
        private Object data;

        /**
         * ÿ���ڵ�ָ����һ���ڵ������
         */
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    /**
     * �������������
     *
     * @param object
     * @return
     */
    public Object addHead(Object object) {
        // ��һ�������½ڵ�
        Node newHead = new Node(object);

        // �ڶ����������Ϊ�գ��򽫸ýڵ�����Ϊͷ���ڵ�
        if (length == 0) {
            head = newHead;
        } else {
            //  ������ ���õ�ǰ�ڵ�Ϊͷ���ڵ㣬������ǰ�ڵ����һ���ڵ�ָ��ԭ����ͷ���ڵ�
            head = newHead;
            newHead.next = head;
        }
        // ���Ĳ� ������+1
        length++;
        return object;
    }

    /**
     * ɾ��ָ����Ԫ�� ���ɾ���ɹ��ͷ���true
     *
     * @param value
     * @return
     */
    public boolean delete(Object value) {
        if (length == 0) {
            return false;
        }

        Node current = head;
        Node previous = head;
        while (current.data != value) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }

        // ���ɾ���Ľڵ���ͷ���
        if (current == head) {
            head = current.next;
            length--;
        } else {// ɾ���Ľڵ㲻��ͷ�ڵ�
            previous.next = current.next;
            length--;
        }
        return true;
    }

    /**
     * ����ָ����Ԫ�أ����ҵ��򷵻أ����򷵻�null
     *
     * @param object
     * @return
     */
    public Node find(Object object) {
        Node current = head;
        int tempSize = length;
        while (tempSize > 0) {
            if (object.equals(current.data)) {
                return current;
            } else {
                current = current.next;
            }
            tempSize--;
        }
        return null;
    }
}
