package stack.impl;

import list.Node;
import list.impl.SLinkedNode;
import stack.StackGeneric;
import stack.exception.StackEmptyException;

public class StackSLinkedGenericImpl<T> implements StackGeneric<T> {

    //栈顶指针
    private Node<T> top;
    //栈中元素的个数
    private int size;

    public StackSLinkedGenericImpl() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }



    /**
     * 入栈
     * 先创建节点，
     * 把入栈元素set进data域
     * next指针域设为null
     * 栈顶指针top指向这个节点
     * size+1
     *
     * 栈结构示意图：
     * *************         *************
     * * next|data *  <<===  * next|data *
     * *************         *************
     *                         //||\\
     *                          ||
     *                         top
     */
    @Override
    public void push(T e) {
        Node<T> sLinkedNode = new SLinkedNode<>(e,top);//注意设置的是top，不是null
        this.top = sLinkedNode;
        size++;
    }

    /**
     * 出栈
     * 先检查栈的size==0
     * 是0，抛出栈为空的异常
     * 不是0，出栈顶节点的data
     * 把原来的top节点的next域的指针赋值个top，
     * 看上面的栈示意图
     */
    @Override
    public T pop() throws StackEmptyException {
        //先检查栈是否为空
        if (this.size < 1){
            throw new StackEmptyException("栈为空");
        }
        //取栈顶节点的数据域
        T data = top.getData();
        //栈顶指针指向原来栈顶节点的前一个节点
        SLinkedNode topSL = null;
        if (top instanceof SLinkedNode) {
            topSL = ((SLinkedNode)top);
        }
        top = topSL.getNext();
        size--;
        return data;
    }

    /**
     * 读栈顶节点的数据域
     * 先判断栈的大小
     * 如果栈大小>1
     * top.getData();
     * 如果栈大小<1
     * 抛出栈为空的异常
     */
    @Override
    public T peek() throws StackEmptyException {
        if (this.size < 1){
            throw new StackEmptyException("栈为空");
        }
        T data = top.getData();
        return data;
    }
}
