package com.book.datastructure.queue;

/**
 *@Description ���е�javaʵ�ְ汾
 *@CreateDate 2021\2\8 0008 13:32
 *@Author z
 *@Version 1.0
 */
public class JavaQueue<E> {
    private Object[] data = null;

    /**
     * ���е�����
     */
    private int maxSize;

    /**
     * ����ͷ �������
     */
    private int front;

    /**
     * ����β ����ɾ��
     */
    private int rear;

    /**
     * @Description Ĭ�ϴ�СΪ10�Ķ���
     * @Author z
     * @Date 2021\2\8 0008 13:38
     * @Param []
     * @Return
     */
    public JavaQueue(){
        this(10);
    }

    /**
     * @Description ����������
     * @Author z
     * @Date 2021\2\8 0008 13:39
     * @Param [initialSize]
     * @Return
     */
    public JavaQueue(int initialSize) {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            front = rear = 0;
        } else {
            throw new RuntimeException("��ʼ����С����С��0��" + initialSize);
        }
    }

    /**
     * ����β����������[��Ӳ���]
     * @param e
     * @return
     */
    public boolean add (E e) {
        if (rear == maxSize) {
            throw new RuntimeException("�����������޷������µ�Ԫ�أ�");
        } else {
            data[rear++] = e;
            return true;
        }
    }

    /**
     * ɾ������ͷ����Ԫ�أ�[����]
     * @return
     */
    public E poll() {
        if (rear == 0) {
            throw new RuntimeException("�ն����쳣��");
        } else {
            // ����front�˵�Ԫ�ص�ֵ
            E value = (E) data[front];
            data[front++] = null;
            return value;
        }
    }

    /**
     * ȡ������ͷ����Ԫ�أ���ɾ�� �������ӣ�
     * @return
     */
    public E peek() {
        if (rear == 0) {
            throw new RuntimeException("�ն����쳣��");
        } else{
            return (E) data[front];
        }

    }
}
