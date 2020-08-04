package list.array;

public class Array {
    private int[] data;
    private int size;

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public void addLast(int e){
        add(size,e);
    }

    public void addFirst(int e){
        add(0,e);
    }

    public void add(int index, int e){

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
        Array scores = new Array(100);
        for (int i = 0;i<10;i++){
            scores.addLast(i);
        }
        System.out.println(scores.toString());
    }
}
