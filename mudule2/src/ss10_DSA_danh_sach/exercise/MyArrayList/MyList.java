package ss10_DSA_danh_sach.exercise.MyArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;    //Số lượng phần tử
    private final int DEFAULT_CAPACITY = 10;   //Sức chứa của mảng
    Object elements[];    //Mảng

    // Sức chứa mặc định khi khai báo bằng contructor không tham sô
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // contructor với sức chứa được truyền vào
    public MyList(int capacity){
        if (capacity > 0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("Side có vấn đề");
        }
    }


    /**
     * Tăng kích thước mảng
     * @param minCapacity
     */
    private void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements =Arrays.copyOf(elements, newSize);
        }else{
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    /**
     * Số lượng phần tử
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * Xóa hết mảng
     */
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    /**
     * Thêm phần tử vào mảng
     * @param element
     * @return
     */
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * Thêm phần tử tại vị trí index
     * @param index
     * @param element
     */
    public void add(int index, E element){
        if (index > elements.length){
            throw new IllegalArgumentException("index không hợp lệ");
        }else if (index == elements.length){
            this.ensureCapacity(1);
        }
        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = size+1; i >= index; i--){
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * lấy ra 1 phần tử
     * @param index
     * @return
     */
    public E get(int index){
        return (E) elements[index];
    }

    /**
     * Lấy ra index của 1 phần tử
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /**
     * Kiểm tra phần tử có trong mảng không
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }

    /**
     * Sao chép MyList hiện tại
     */
    public MyList<E> clone(){
        MyList<E> myList = new MyList<>();
        myList.elements = Arrays.copyOf(this.elements,this.size);
        myList.size = this.size;
        return myList;
    }


    /**
     * Xóa 1 phần tử tại vị trí index
     * @param index
     * @return
     */
    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Index sai");
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

}
