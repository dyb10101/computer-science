package test.stack;

import stack.Stack;
import stack.exception.StackEmptyException;

/**
 * 栈的顺序存储实现方式
 */
public class StackArray implements Stack {

    // 元素数组
    private Object[] elements;
    // 元素数组的默认大小
    private final int LEN = 8;
    // 栈顶指针
    private int top;

    public StackArray() {
        // 默认创建数组的长度为8
        this.elements = new Object[LEN];
        // 栈顶指针赋值-1
        this.top = -1;
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
    public void push(Object e) {
        if(getSize() >= elements.length){
            //栈满了，扩充栈的容量
            expandStackSpace();
        }
        //入栈元素e,并把栈顶指针加1
        elements[++top] = e;
    }

    /**
     * 栈顶元素出栈
     * 先判断栈是否为空
     * 如果栈为空，抛出栈为空的异常
     * 栈不为空，栈顶元素出栈,并把栈顶元素设置为null
     * 栈顶指针减1
     */
    @Override
    public Object pop() throws StackEmptyException {
        if (getSize() < 1){
            throw new StackEmptyException("栈为空");
        }
        Object topEle = elements[top];
        elements[top] = null;
        --top;
        return topEle;
    }

    /**
    * 读栈顶元素
    */
    @Override
    public Object peek() throws StackEmptyException {
        if (getSize() < 1){
            throw new StackEmptyException("栈为空");
        }
        return elements[top];
    }

    private void expandStackSpace() {
        Object[] elements2 = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            elements2[i] = elements[i];
        }
        elements = elements2;
    }
}
