package code._4_student_effort._1_iterator;

public class ArrayCustomIterator {
    private int[] arr;
    private int currentIndex;

    public ArrayCustomIterator(int arr[]){
        this.arr = arr;
        currentIndex = 0;
    }

    public boolean hasNext()
    {
        return  this.currentIndex < this.arr.length;
    }

    public int next()
    {
        return this.arr[this.currentIndex++];
    }
}

