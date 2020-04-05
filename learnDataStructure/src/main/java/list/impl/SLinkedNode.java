package list.impl;

import list.Node;

/**
 * 单向链表
 */
public class SLinkedNode<T> implements Node<T> {
    //数据域
    private T data;
    //指针域
    private Node<T> next;

    public SLinkedNode() {
        this.data = null;
        this.next = null;
    }

    public SLinkedNode(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return this.data;
    }

}
