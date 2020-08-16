package list.array;

public class Array<E> {
    private E[] data;
    private int size;//数组中实际的元素个数

    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public void addLast(E e){
        add(size,e);
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void add(int index, E e){

        if (size == data.length)
            throw new IllegalArgumentException("add failed,array is full");

        if (index < 0 || index > size)
            throw new IllegalArgumentException("add failed,index  < 0 || index > size");

        for (int i = size - 1;i >= index;i--){
            data[i + 1] = data[i];
        }
        data[index] = e;
        ++size;
    }

    public E remove(int index){
        if (size == data.length)
            throw new IllegalArgumentException("add failed,array is full");

        if (index < 0 || index > size)
            throw new IllegalArgumentException("add failed,index  < 0 || index > size");

        E e = data[index];
        for (int i = index;i<size;i++){
            data[i] = data[i+1];
        }
        --size;//size减小1
        data[size] = null;//这时的size正好是被删除的元素的index，不用再减一了
        return e;
    }

    //获取index位置的元素
    public E get(int index){
        if (index<0 || index >=size)
            throw new IllegalArgumentException("get failed, index is illegal: " + index);
        return data[index];
    }
    //修改index位置的元素值
    public void set(int index,E e){
        if (index<0 || index >=size)
            throw new IllegalArgumentException("get failed, index is illegal: " + index);
        data[index] = e;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Array:[size = %d , capacity = %d]\n",size,data.length));
        result.append("[");
        for (int i =0 ; i<size;i++){
            result.append(data[i]);
            if (i!=size-1){
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        Array<Integer> scores = new Array(100);
        for (int i = 0;i<10;i++){
            scores.addLast(i);
        }
        System.out.println(scores);

        scores.addFirst(888);
        System.out.println(scores);

        scores.add(1,666);
        System.out.println(scores);

        System.out.println(scores.get(10));

        scores.set(0,888666);
        System.out.println(scores);

        int index = scores.size;
        Integer removedEle = scores.remove(index);
        System.out.println("被删除的元素："+"index = "+index+";value = "+removedEle);
        System.out.println("被删除元素后的数组："+scores);
    }
}
