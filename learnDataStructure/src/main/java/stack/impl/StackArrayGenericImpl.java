package stack.impl;

import stack.StackGeneric;
import stack.exception.StackEmptyException;

public class StackArrayGenericImpl<T> implements StackGeneric<T> {

    //元素数组
    private T[] elements;
    //元素数组长度
    private final int LEN = 8;
    //栈顶指针
    private int top;

    public StackArrayGenericImpl() {
        //注意：不能直接创建泛型数组
        this.elements = (T[]) new Object[LEN];
        // 栈顶指针赋值-1
        top = -1;
    }

    @Override
    public int getSize() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    /**
     * 入栈操作：
     * 先判断栈是否满了，
     * 如果满了，扩充栈的容量，再入栈
     * 没有满，直接入栈，栈顶指针加1
     */
    @Override
    public void push(T e) {
        if(getSize() >= elements.length){
            //栈满了，扩充栈的容量
            expandStackSpace();
        }
        //入栈元素e,并把栈顶指针加1
        elements[++top] = e;
    }

    /**
     * 读栈顶元素
     */
    @Override
    public T peek() throws StackEmptyException {
        if (getSize() < 1){
            throw new StackEmptyException("栈为空");
        }
        return elements[top];
    }

    /**
     * 栈顶元素出栈
     * 先判断栈是否为空
     * 如果栈为空，抛出栈为空的异常
     * 栈不为空，栈顶元素出栈,并把栈顶元素设置为null
     * 栈顶指针减1
     */
    @Override
    public T pop() throws StackEmptyException {
        if (getSize() < 1){
            throw new StackEmptyException("栈为空");
        }
        T topEle = elements[top];
        elements[top] = null;
        --top;
        return topEle;
    }

    private void expandStackSpace() {
        T[] elements2 = (T[])new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            elements2[i] = elements[i];
        }
        elements = elements2;
    }
}
